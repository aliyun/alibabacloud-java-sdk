// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the historical tasks. </p>
     * <p>Default value: 0. Valid values:</p>
     * <ul>
     * <li>0: returns the current task.</li>
     * <li>1: returns the historical tasks.</li>
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
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Specify a value greater than 10. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <p> If you set the Region parameter to <strong>all</strong>, all tasks created within your Alibaba Cloud account are queried. In this case, you must set the <strong>taskType</strong> parameter to <strong>all</strong>.</p>
     * </blockquote>
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
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li>rds_apsaradb_ha: master-replica switchover</li>
     * <li>rds_apsaradb_transfer: instance migration</li>
     * <li>rds_apsaradb_upgrade: minor version update</li>
     * </ul>
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
