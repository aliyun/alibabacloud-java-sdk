// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceGroupInspectReportDetailRequest extends TeaModel {
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13f52040-5a6e-42c3-bb84-051f5d6d****</p>
     */
    @NameInMap("ReportId")
    public String reportId;

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

}
