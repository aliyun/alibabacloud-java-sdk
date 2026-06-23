// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether the task can be canceled. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: The task cannot be canceled.</p>
     * </li>
     * <li><p><strong>1</strong>: The task can be canceled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowCancel")
    public Integer allowCancel;

    /**
     * <p>Specifies whether the time can be changed. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: The time cannot be changed.</p>
     * </li>
     * <li><p><strong>1</strong>: The time can be changed.</p>
     * </li>
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
     * <li><p><strong>all</strong> (Default): All levels.</p>
     * </li>
     * <li><p><strong>S0</strong>: Returns tasks for fixing exceptions.</p>
     * </li>
     * <li><p><strong>S1</strong>: Returns tasks for system O\&amp;M.</p>
     * </li>
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
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong> (Default)</p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
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
     * <p>The region ID.</p>
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
     * <p>The task status. This parameter is used to filter tasks.</p>
     * <ul>
     * <li><p><strong>-1:</strong> All tasks.</p>
     * </li>
     * <li><p><strong>3:</strong> Tasks to be processed.</p>
     * </li>
     * <li><p><strong>4:</strong> Tasks in progress.</p>
     * </li>
     * <li><p><strong>5:</strong> Successfully completed tasks.</p>
     * </li>
     * <li><p><strong>6:</strong> Failed tasks.</p>
     * </li>
     * <li><p><strong>7:</strong> Canceled tasks.</p>
     * </li>
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
     * <li><p><strong>rds_apsaradb_upgrade</strong>: Minor version upgrade.</p>
     * </li>
     * <li><p><strong>all</strong>: All task types.</p>
     * </li>
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
