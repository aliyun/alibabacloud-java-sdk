// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalAgentSkillGroupReportRequest extends TeaModel {
    /**
     * <p>The agent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The end time. This is a UNIX timestamp in milliseconds. This parameter is not required. The default value is the current time. If Interval is set to Daily, the maximum interval between StartTime and EndTime is 180 days. If Interval is set to Hourly, the maximum interval is 10 days. The statistics are measured in hours and rounded up to the nearest hour. This is an open interval. For example, if the start time is 11:12:20 and the end time is 11:45:50, the aligned time range for the input parameters is [11:00:00, 12:00:00), which means greater than or equal to 11:00 and less than 12:00.</p>
     * 
     * <strong>example:</strong>
     * <p>1558443508000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of interval-based statistics. This parameter is not required. The default value is Daily (summarized by day).</p>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skg-default@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <p>The start timestamp. The default value is 00:00 on the current day. The statistics are measured in hours and rounded down to the nearest hour. This is a closed interval.</p>
     * 
     * <strong>example:</strong>
     * <p>1532448000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListIntervalAgentSkillGroupReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalAgentSkillGroupReportRequest self = new ListIntervalAgentSkillGroupReportRequest();
        return TeaModel.build(map, self);
    }

    public ListIntervalAgentSkillGroupReportRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListIntervalAgentSkillGroupReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListIntervalAgentSkillGroupReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListIntervalAgentSkillGroupReportRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public ListIntervalAgentSkillGroupReportRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public ListIntervalAgentSkillGroupReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
