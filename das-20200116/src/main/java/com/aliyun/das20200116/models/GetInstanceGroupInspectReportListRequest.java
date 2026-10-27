// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceGroupInspectReportListRequest extends TeaModel {
    /**
     * <p>Optional. The default agent is used by default. Alternatively, you can specify an agent that was generated after DAS Agent was activated or manually created.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-472T0DxtmjIxxxxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The end time of the query, which is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1655427625000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>daily</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The start time of the query, which is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetInstanceGroupInspectReportListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceGroupInspectReportListRequest self = new GetInstanceGroupInspectReportListRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceGroupInspectReportListRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GetInstanceGroupInspectReportListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetInstanceGroupInspectReportListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetInstanceGroupInspectReportListRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public GetInstanceGroupInspectReportListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
