// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryRequest extends TeaModel {
    // The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC`.
    // 
    // This parameter is empty by default. If this parameter is empty, the current time is used.
    @NameInMap("EndTime")
    public String endTime;

    // The instance type of the instance.
    @NameInMap("InstanceType")
    public String instanceType;

    // Specifies whether the instance is I/O optimized. Valid values:
    // 
    // *   optimized: The instance is I/O optimized.
    // *   none: The instance is not I/O optimized.
    // 
    // For generation I instance families, the default value is none.
    // 
    // For other instance families, the default value is optimized.
    @NameInMap("IoOptimized")
    public String ioOptimized;

    // The network type of the preemptible instance. Valid values:
    // 
    // *   classic
    // *   vpc
    @NameInMap("NetworkType")
    public String networkType;

    // The type of the operating system platform. Valid values:
    // 
    // *   linux
    // *   windows
    @NameInMap("OSType")
    public String OSType;

    // The line from which the next query starts.
    // 
    // Default value: 0.
    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The protection period of the preemptible instance. Unit: hours. Valid values: 0, 1, 2, 3, 4, 5, and 6.
    // 
    // *   Protection periods of 2, 3, 4, 5, and 6 hours are in invitational preview. If you want to set this parameter to one of these values, submit a ticket.
    // *   If this parameter is set to 0, no protection period is configured for the preemptible instance.
    // 
    // Default value: 1.
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    // The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC`.
    // 
    // This parameter is empty by default. If this parameter is empty, it indicates 3 hours earlier than the specified EndTime value. You can specify a StartTime value of up to 30 days earlier than the specified EndTime value.
    @NameInMap("StartTime")
    public String startTime;

    // The zone ID of the instance.
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
