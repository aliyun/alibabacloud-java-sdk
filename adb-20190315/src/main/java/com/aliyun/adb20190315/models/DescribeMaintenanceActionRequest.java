// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeMaintenanceActionRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the information about pending or historical O\&M events. Valid values:</p>
     * <br>
     * <p>*   **0**: returns the information about pending O\&M event.</p>
     * <p>*   **1**: returns the information about historical O\&M event.</p>
     * <br>
     * <p>If you do not specify this parameter, the information about pending O\&M event are returned.</p>
     */
    @NameInMap("IsHistory")
    public Integer isHistory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: **30**, **50**, and **100**. Default value: 30.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. Valid values:</p>
     * <br>
     * <p>*   The ID of the region where the O\&M event occurs. Example: `cn-hangzhou`. You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     * <p>*   You can also set Region to `all` to query the O\&M events in all regions. If you set `Region` to `all`, you must set `TaskType` to `all`.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the region where the O\&M event occurs.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the O\&M event. Valid values:</p>
     * <br>
     * <p>*   **rds_apsaradb_upgrade**: database software upgrades.</p>
     * <p>*   **all**: all the O\&M events in all regions within the current account. If you set `Region` to `all`, you must set `TaskType` to `all`.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeMaintenanceActionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaintenanceActionRequest self = new DescribeMaintenanceActionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMaintenanceActionRequest setIsHistory(Integer isHistory) {
        this.isHistory = isHistory;
        return this;
    }
    public Integer getIsHistory() {
        return this.isHistory;
    }

    public DescribeMaintenanceActionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeMaintenanceActionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeMaintenanceActionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMaintenanceActionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMaintenanceActionRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeMaintenanceActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMaintenanceActionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeMaintenanceActionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeMaintenanceActionRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
