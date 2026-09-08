// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalAgentReportRequest extends TeaModel {
    /**
     * <p>Agent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>End time, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is the current time. If Interval is Daily, the maximum interval between StartTime and EndTime is 180 days. If Interval is Hourly, the maximum interval is 10 days. Time precision for statistics is at the hour level, rounded down to the next full hour, using an open interval. For example, if the start time is 11:12:20 and the end time is 11:45:50, the aligned input time range becomes [11:00:00, 12:00:00), meaning greater than or equal to 11:00:00 and less than 12:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1532707199000</p>
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
     * <p>Segment statistics type. Optional. Default value is Daily (aggregated by Day).</p>
     * 
     * <strong>example:</strong>
     * <p>Hourly</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>Media type. The default value is Audio. Other valid values include Chat and Video.</p>
     * 
     * <strong>example:</strong>
     * <p>VIDEO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Start time, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is 00:00:00 of the current day. Time precision for statistics is at the hour level, rounded down to the previous full hour, using a closed interval.</p>
     * 
     * <strong>example:</strong>
     * <p>1532448000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListIntervalAgentReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalAgentReportRequest self = new ListIntervalAgentReportRequest();
        return TeaModel.build(map, self);
    }

    public ListIntervalAgentReportRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListIntervalAgentReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListIntervalAgentReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListIntervalAgentReportRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public ListIntervalAgentReportRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListIntervalAgentReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
