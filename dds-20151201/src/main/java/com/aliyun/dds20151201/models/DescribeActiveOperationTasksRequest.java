// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether the task can be canceled. Valid values:</p>
     * <ul>
     * <li><p><strong>-1</strong> (default): returns all tasks.</p>
     * </li>
     * <li><p><strong>0</strong>: returns only tasks that cannot be canceled.</p>
     * </li>
     * <li><p><strong>1</strong>: returns only tasks that can be canceled.</p>
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
     * <li><p><strong>-1</strong> (default): returns all tasks.</p>
     * </li>
     * <li><p><strong>0</strong>: returns only tasks whose time cannot be changed.</p>
     * </li>
     * <li><p><strong>1</strong>: returns only tasks whose time can be changed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("AllowChange")
    public Integer allowChange;

    /**
     * <p>The level of the task. Valid values:</p>
     * <ul>
     * <li><p><strong>all</strong> (default): returns all tasks.</p>
     * </li>
     * <li><p><strong>S0</strong>: returns tasks for exception fixing.</p>
     * </li>
     * <li><p><strong>S1</strong>: returns tasks for system O\&amp;M.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ChangeLevel")
    public String changeLevel;

    /**
     * <p>The database type. Default value: <strong>all</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>mongoDb</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The name of the instance. This parameter is optional. You can specify only one instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp16aaccfe10****</p>
     */
    @NameInMap("InsName")
    public String insName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product name. For MongoDB instances, set this parameter to <strong>MongoDB</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The ID of the region where the pending event is located. Call the DescribeRegions operation to obtain the region ID.</p>
     * <blockquote>
     * <p>A value of <strong>all</strong> indicates all region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task status. This parameter filters the returned tasks.</p>
     * <ul>
     * <li><p><strong>-1</strong>: all tasks.</p>
     * </li>
     * <li><p><strong>3</strong>: pending tasks.</p>
     * </li>
     * <li><p><strong>4</strong>: running tasks.</p>
     * </li>
     * <li><p><strong>5</strong>: successfully completed tasks.</p>
     * </li>
     * <li><p><strong>6</strong>: failed tasks.</p>
     * </li>
     * <li><p><strong>7</strong>: canceled tasks.</p>
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
     * <li><p><strong>rds_apsaradb_ha</strong>: primary-secondary node switchover.</p>
     * </li>
     * <li><p><strong>rds_apsaradb_transfer</strong>: instance migration.</p>
     * </li>
     * <li><p><strong>rds_apsaradb_upgrade</strong>: minor version upgrade.</p>
     * </li>
     * <li><p><strong>rds_apsaradb_maxscale</strong>: proxy minor version upgrade.</p>
     * </li>
     * <li><p><strong>all</strong>: all task types.</p>
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

    public DescribeActiveOperationTasksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
