// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to return historical tasks. Valid values:</p>
     * <ul>
     * <li>0: returns current tasks. This is the default value.</li>
     * <li>1: returns historical tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsHistory")
    public Integer isHistory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be greater than 0 and not exceed the maximum value of the Integer data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries to return on each page. The value must be greater than 10. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The ID of the region to which the pending events belong. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query region IDs. If you set this parameter to all, all tasks under the current account are queried, and the TaskType parameter must also be set to all.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>rds_apsaradb_ha: primary/secondary node switch.</li>
     * <li>rds_apsaradb_transfer: instance migration.</li>
     * <li>rds_apsaradb_upgrade: minor version update.</li>
     * </ul>
     * <p>You can obtain the valid values from the <a href="https://help.aliyun.com/document_detail/2639186.html">DescribeHistoryTasks</a> operation.</p>
     * <p>If you set this parameter to all, all tasks under the current account are queried, and the Region parameter must also be set to all.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_apsaradb_ha</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeActiveOperationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskRequest self = new DescribeActiveOperationTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskRequest setIsHistory(Integer isHistory) {
        this.isHistory = isHistory;
        return this;
    }
    public Integer getIsHistory() {
        return this.isHistory;
    }

    public DescribeActiveOperationTaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeActiveOperationTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeActiveOperationTaskRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActiveOperationTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeActiveOperationTaskRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DescribeActiveOperationTaskRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeActiveOperationTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeActiveOperationTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeActiveOperationTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
