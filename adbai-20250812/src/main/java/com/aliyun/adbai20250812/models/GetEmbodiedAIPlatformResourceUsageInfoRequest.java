// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class GetEmbodiedAIPlatformResourceUsageInfoRequest extends TeaModel {
    /**
     * <p>The instance cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range for querying network resource usage. Format: yyyy-MM-ddTHH:mmZ.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-20T01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the embodied intelligence platform.</p>
     * 
     * <strong>example:</strong>
     * <p>platform1</p>
     */
    @NameInMap("PlatformName")
    public String platformName;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <p>You can call the DescribeRegions operation to query the region ID of a specified Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start of the time range for querying network resource usage. Format: yyyy-MM-ddTHH:mmZ.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-10T01:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetEmbodiedAIPlatformResourceUsageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmbodiedAIPlatformResourceUsageInfoRequest self = new GetEmbodiedAIPlatformResourceUsageInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetEmbodiedAIPlatformResourceUsageInfoRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoRequest setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
