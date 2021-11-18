// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentSummaryReportsByIntervalRequest extends TeaModel {
    @NameInMap("AgentIds")
    public String agentIds;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("StartTime")
    public String startTime;

    public static ListAgentSummaryReportsByIntervalRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSummaryReportsByIntervalRequest self = new ListAgentSummaryReportsByIntervalRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentSummaryReportsByIntervalRequest setAgentIds(String agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public String getAgentIds() {
        return this.agentIds;
    }

    public ListAgentSummaryReportsByIntervalRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAgentSummaryReportsByIntervalRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentSummaryReportsByIntervalRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public ListAgentSummaryReportsByIntervalRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentSummaryReportsByIntervalRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentSummaryReportsByIntervalRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public ListAgentSummaryReportsByIntervalRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
