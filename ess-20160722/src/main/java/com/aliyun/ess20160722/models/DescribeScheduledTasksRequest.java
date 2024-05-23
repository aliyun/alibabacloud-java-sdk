// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeScheduledTasksRequest extends TeaModel {
    @NameInMap("ScheduledAction")
    public java.util.List<String> scheduledAction;

    @NameInMap("ScheduledTaskId")
    public java.util.List<String> scheduledTaskId;

    @NameInMap("ScheduledTaskName")
    public java.util.List<String> scheduledTaskName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeScheduledTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTasksRequest self = new DescribeScheduledTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTasksRequest setScheduledAction(java.util.List<String> scheduledAction) {
        this.scheduledAction = scheduledAction;
        return this;
    }
    public java.util.List<String> getScheduledAction() {
        return this.scheduledAction;
    }

    public DescribeScheduledTasksRequest setScheduledTaskId(java.util.List<String> scheduledTaskId) {
        this.scheduledTaskId = scheduledTaskId;
        return this;
    }
    public java.util.List<String> getScheduledTaskId() {
        return this.scheduledTaskId;
    }

    public DescribeScheduledTasksRequest setScheduledTaskName(java.util.List<String> scheduledTaskName) {
        this.scheduledTaskName = scheduledTaskName;
        return this;
    }
    public java.util.List<String> getScheduledTaskName() {
        return this.scheduledTaskName;
    }

    public DescribeScheduledTasksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScheduledTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScheduledTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScheduledTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScheduledTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScheduledTasksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScheduledTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
