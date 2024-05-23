// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the [ISO 8601 standard](~~25696~~) in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is empty by default. If this parameter is empty, the current time is used.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. The specified time can be up to 30 days earlier than the specified EndTime value.</p>
     * <br>
     * <p>This parameter is empty by default. If this parameter is empty, the time that is 3 hours earlier than the specified EndTime value is used.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
     * <br>
     * <p>*   optimized: The instance is I/O optimized.</p>
     * <p>*   none: The instance is not I/O optimized.</p>
     * <br>
     * <p>For instances of generation I instance families, the default value is none.</p>
     * <br>
     * <p>For instances of other instance families, the default value is optimized.</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The network type of the preemptible instance. Valid values:</p>
     * <br>
     * <p>*   classic: classic network</p>
     * <p>*   vpc: Virtual Private Cloud (VPC)</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The type of the operating system platform. Valid values:</p>
     * <br>
     * <p>- linux</p>
     * <p>- windows</p>
     */
    @NameInMap("OSType")
    public String OSType;

    /**
     * <p>The line from which the query starts.</p>
     * <br>
     * <p>Default value: 0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The zone ID of the preemptible instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values:</p>
     * <br>
     * <p>*   1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * <p>*   0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</p>
     * <br>
     * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify a protection period based on your business requirements.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set SpotStrategy to SpotWithPriceLimit or SpotAsPriceGo.</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The beginning of the time range to query. The value of this parameter and the value of EndTime can be up to 30 days apart. Specify the time in the [ISO 8601 standard](~~25696~~) in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is left empty by default. If this parameter is empty, the time that is 3 hours earlier than the value of EndTime is used.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The spot price (market price) of the preemptible instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeSpotPriceHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotPriceHistoryRequest self = new DescribeSpotPriceHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpotPriceHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSpotPriceHistoryRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeSpotPriceHistoryRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeSpotPriceHistoryRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeSpotPriceHistoryRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public DescribeSpotPriceHistoryRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public DescribeSpotPriceHistoryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSpotPriceHistoryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSpotPriceHistoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSpotPriceHistoryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSpotPriceHistoryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSpotPriceHistoryRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public DescribeSpotPriceHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSpotPriceHistoryRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
