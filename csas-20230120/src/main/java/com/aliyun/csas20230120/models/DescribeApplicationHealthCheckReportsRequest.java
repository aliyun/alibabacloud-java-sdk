// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DescribeApplicationHealthCheckReportsRequest extends TeaModel {
    /**
     * <p>The IDs of the internal-facing applications. You can specify up to 100 application IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds. If this parameter is not specified, the default value is the current time. If only the start time is specified, the end time is set to 5 minutes after the start time. The end time must be later than the start time, and the maximum query time range is 7 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000600</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds. If this parameter is not specified, the default value is 5 minutes before the end time. If only the end time is specified, the start time is set to 5 minutes before the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeApplicationHealthCheckReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationHealthCheckReportsRequest self = new DescribeApplicationHealthCheckReportsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationHealthCheckReportsRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public DescribeApplicationHealthCheckReportsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeApplicationHealthCheckReportsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
