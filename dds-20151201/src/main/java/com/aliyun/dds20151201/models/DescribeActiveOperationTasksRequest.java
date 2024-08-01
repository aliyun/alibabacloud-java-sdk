// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow the cancellation operation. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The cancellation operation is not allowed.</li>
     * <li><strong>1</strong>: The cancellation operation is allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AllowCancel")
    public Integer allowCancel;

    /**
     * <p>Specifies whether to allow the modification operation. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The modification operation is not allowed.</li>
     * <li><strong>1</strong>: The modification operation is allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowChange")
    public Integer allowChange;

    /**
     * <p>The type of task configuration change. Valid values:</p>
     * <ul>
     * <li><strong>all</strong> (default): The configurations of all O\&amp;M tasks are changed.</li>
     * <li><strong>S0</strong>: The configurations of tasks initiated to fix exceptions are changed.</li>
     * <li><strong>S1</strong>: The configurations of system O\&amp;M tasks are changed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ChangeLevel")
    public String changeLevel;

    /**
     * <p>The type of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp16aaccfe10e3e4</p>
     */
    @NameInMap("InsName")
    public String insName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>30, 50, and 100</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <p> If you set the Region parameter to <strong>all</strong>, all tasks created within your Alibaba Cloud account are queried. In this case, you must set the <strong>taskType</strong> parameter to <strong>all</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: waiting for execution</li>
     * <li><strong>1</strong>: being executed</li>
     * <li><strong>2</strong>: successful</li>
     * <li><strong>3</strong>: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The task type.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeActiveOperationTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTasksRequest self = new DescribeActiveOperationTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTasksRequest setAllowCancel(Integer allowCancel) {
        this.allowCancel = allowCancel;
        return this;
    }
    public Integer getAllowCancel() {
        return this.allowCancel;
    }

    public DescribeActiveOperationTasksRequest setAllowChange(Integer allowChange) {
        this.allowChange = allowChange;
        return this;
    }
    public Integer getAllowChange() {
        return this.allowChange;
    }

    public DescribeActiveOperationTasksRequest setChangeLevel(String changeLevel) {
        this.changeLevel = changeLevel;
        return this;
    }
    public String getChangeLevel() {
        return this.changeLevel;
    }

    public DescribeActiveOperationTasksRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeActiveOperationTasksRequest setInsName(String insName) {
        this.insName = insName;
        return this;
    }
    public String getInsName() {
        return this.insName;
    }

    public DescribeActiveOperationTasksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeActiveOperationTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeActiveOperationTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActiveOperationTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeActiveOperationTasksRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DescribeActiveOperationTasksRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeActiveOperationTasksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeActiveOperationTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeActiveOperationTasksRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeActiveOperationTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
