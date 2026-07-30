// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceGroupInspectReportDetailRequest extends TeaModel {
    /**
     * <p>The ID of the agent that the user purchased.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-472T0DxtmjIxxxxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The ID of the automated operations report.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13f52040-5a6e-42c3-bb84-051f5d6d****</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The type of the report.</p>
     * 
     * <strong>example:</strong>
     * <p>daily</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    public static GetInstanceGroupInspectReportDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceGroupInspectReportDetailRequest self = new GetInstanceGroupInspectReportDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceGroupInspectReportDetailRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GetInstanceGroupInspectReportDetailRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetInstanceGroupInspectReportDetailRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

}
