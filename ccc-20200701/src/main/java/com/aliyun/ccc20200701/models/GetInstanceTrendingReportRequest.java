// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetInstanceTrendingReportRequest extends TeaModel {
    /**
     * <p>End UNIX timestamp. The default value is the current time. The format is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1604725528000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Media type. The default value is Audio. Other valid values include Chat and Video.</p>
     * 
     * <strong>example:</strong>
     * <p>Audio</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Start UNIX timestamp. The default value is the start time of the current day. The earliest allowed time is 180 days before the current time. The interval between the start time and end time cannot exceed 7 days. The format is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1604639129000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetInstanceTrendingReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTrendingReportRequest self = new GetInstanceTrendingReportRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceTrendingReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetInstanceTrendingReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceTrendingReportRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public GetInstanceTrendingReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
