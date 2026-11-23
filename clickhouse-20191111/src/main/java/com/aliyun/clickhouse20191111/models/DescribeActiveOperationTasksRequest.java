// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether the task can be canceled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not allowed.</li>
     * <li><strong>1</strong>: allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowCancel")
    public Integer allowCancel;

    /**
     * <p>Specifies whether the execution time can be modified. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not allowed.</li>
     * <li><strong>1</strong>: allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowChange")
    public Integer allowChange;

    /**
     * <p>The task level. Valid values:</p>
     * <ul>
     * <li><strong>all</strong> (default): all levels.</li>
     * <li><strong>S0</strong>: exception fix tasks.</li>
     * <li><strong>S1</strong>: system O&amp;M tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("ChangeLevel")
    public String changeLevel;

    /**
     * <p>The database type.</p>
     * 
     * <strong>example:</strong>
     * <p>clickhouse</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp191w*******</p>
     */
    @NameInMap("InsName")
    public String insName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
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
     * <p>clickhouse</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region.</p>
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

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The task status, which is used to filter returned tasks. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: all tasks.</li>
     * <li><strong>3</strong>: pending tasks.</li>
     * <li><strong>4</strong>: in-progress tasks.</li>
     * <li><strong>5</strong>: successfully completed tasks.</li>
     * <li><strong>6</strong>: failed tasks.</li>
     * <li><strong>7</strong>: canceled tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>rds_apsaradb_upgrade</strong>: minor version update.</li>
     * <li><strong>all</strong>: all task types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
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

    public DescribeActiveOperationTasksRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
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
