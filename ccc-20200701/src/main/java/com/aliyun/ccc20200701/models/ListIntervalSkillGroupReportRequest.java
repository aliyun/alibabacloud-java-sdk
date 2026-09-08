// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalSkillGroupReportRequest extends TeaModel {
    /**
     * <p>End Time, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is the current time. If Interval is Daily, the maximum interval between StartTime and EndTime is 180 days. If Interval is Hourly, the maximum interval is 10 days. The time precision for statistics is hourly, snapped backward to the nearest hour, using an open interval. For example, if the Start Time is 11:12:20 and the End Time is 11:45:50, the aligned input parameter Time Range becomes [11:00:00, 12:00:00), meaning greater than or equal to 11:00:00 and less than 12:00:00.</p>
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
     * <p>Segment statistics type. The default is Daily (aggregated by day).</p>
     * 
     * <strong>example:</strong>
     * <p>Hourly</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>Media type. The default is Audio. Other valid values include Chat and Video.</p>
     * 
     * <strong>example:</strong>
     * <p>VIDEO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skg-default@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <p>Start Time, formatted as a UNIX timestamp in milliseconds. This parameter is optional. The default value is 00:00 of the current day. Statistics are aggregated by hour, rounded down to the nearest hour, and the interval is closed.</p>
     * 
     * <strong>example:</strong>
     * <p>1604639129000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListIntervalSkillGroupReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalSkillGroupReportRequest self = new ListIntervalSkillGroupReportRequest();
        return TeaModel.build(map, self);
    }

    public ListIntervalSkillGroupReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListIntervalSkillGroupReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListIntervalSkillGroupReportRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public ListIntervalSkillGroupReportRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListIntervalSkillGroupReportRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public ListIntervalSkillGroupReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
