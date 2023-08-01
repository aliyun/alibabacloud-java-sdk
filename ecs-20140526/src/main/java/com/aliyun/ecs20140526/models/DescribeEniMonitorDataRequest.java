// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEniMonitorDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If the value of seconds (ss) is not 00, the time is rounded up to the next minute.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The secondary ENI ID. By default, all secondary ENIs that are bound to the specified instance are queried.</p>
     */
    @NameInMap("EniId")
    public String eniId;

    /**
     * <p>The ID of the instance to which the secondary ENI is bound.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The interval at which to retrieve monitoring data. Unit: seconds. Valid values:</p>
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
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If the value of seconds (ss) is not 00, the time is rounded up to the next minute.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeEniMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEniMonitorDataRequest self = new DescribeEniMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEniMonitorDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEniMonitorDataRequest setEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }
    public String getEniId() {
        return this.eniId;
    }

    public DescribeEniMonitorDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeEniMonitorDataRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeEniMonitorDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEniMonitorDataRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeEniMonitorDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEniMonitorDataRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeEniMonitorDataRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeEniMonitorDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
