// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotPriceHistoryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("NetworkType")
    @Validation(required = true)
    public String networkType;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OSType")
    public String OSType;

    @NameInMap("Offset")
    public Integer offset;

    public static DescribeSpotPriceHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotPriceHistoryRequest self = new DescribeSpotPriceHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpotPriceHistoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSpotPriceHistoryRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeSpotPriceHistoryRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeSpotPriceHistoryRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeSpotPriceHistoryRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public DescribeSpotPriceHistoryRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeSpotPriceHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSpotPriceHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

}
