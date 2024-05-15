// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotMonitorDataRequest extends TeaModel {
    /**
     * <p>The category of the snapshot. Valid values:</p>
     * <br>
     * <p>*   Standard: normal snapshot</p>
     * <p>*   Flash: local snapshot</p>
     * <br>
     * <p>Default value: Standard.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The end of the time range to query. Specify the time in the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If the value of seconds (ss) is not 00, the time is rounded up to the next minute.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The interval at which to query the monitoring data of snapshot sizes. Unit: seconds. Valid values:</p>
     * <br>
     * <p>*   60</p>
     * <p>*   600</p>
     * <p>*   3600</p>
     * <br>
     * <p>Default value: 60.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If the value of seconds (ss) is not 00, the time is rounded up to the next minute.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSnapshotMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotMonitorDataRequest self = new DescribeSnapshotMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotMonitorDataRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeSnapshotMonitorDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSnapshotMonitorDataRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSnapshotMonitorDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSnapshotMonitorDataRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeSnapshotMonitorDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSnapshotMonitorDataRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSnapshotMonitorDataRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSnapshotMonitorDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
