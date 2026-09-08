// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalInstanceReportRequest extends TeaModel {
    /**
     * <p>End Time, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is the current time. If Interval is Daily, the maximum interval between StartTime and EndTime is 180 days. If Interval is Hourly, the maximum interval is 10 days. The time precision for statistics is hourly, snapped backward to the start of the hour, using an open interval. For example, if the original Start Time is 11:12:20 and End Time is 11:45:50, the aligned time range becomes [11:00:00, 12:00:00), meaning greater than or equal to 11:00:00 and less than 12:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1620316799000</p>
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
     * <p>Segment statistics type. This parameter is optional. The default value is Daily (daily aggregation).</p>
     * 
     * <strong>example:</strong>
     * <p>Hourly</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>Start Time, in UNIX timestamp format with millisecond precision. This parameter is optional. The default value is 00:00 of the current day. The time granularity for statistics is hourly, rounded down to the nearest hour, and uses a closed interval.</p>
     * 
     * <strong>example:</strong>
     * <p>1620230400000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListIntervalInstanceReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalInstanceReportRequest self = new ListIntervalInstanceReportRequest();
        return TeaModel.build(map, self);
    }

    public ListIntervalInstanceReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListIntervalInstanceReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListIntervalInstanceReportRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public ListIntervalInstanceReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
