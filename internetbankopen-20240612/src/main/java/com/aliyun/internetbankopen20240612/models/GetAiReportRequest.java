// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612.models;

import com.aliyun.tea.*;

public class GetAiReportRequest extends TeaModel {
    /**
     * <p>The data call ID, which is obtained from the callId returned by InvokeDataProduct. You must specify either this parameter or reportId. You cannot specify both or leave both empty. The value must start with call- and be 1 to 64 characters in length. It can contain only ASCII letters, digits, underscores (_), and hyphens (-). The value is case-sensitive, and leading and trailing spaces are not trimmed. If the format is invalid, InvalidParameter.CallId is returned. If both parameters are specified or left empty, InvalidParameter.ReportReference is returned. This parameter is used to query the status of per-use reports. If you use this ID to query a periodic report, WAITING_PERIOD is always returned. Use the ReportId from the list instead.</p>
     * 
     * <strong>example:</strong>
     * <p>call-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a</p>
     */
    @NameInMap("callId")
    public String callId;

    /**
     * <p>The report ID, which is obtained from the ReportId returned by ListProductReports or the Report.ReportId in the previous available result of GetAiReport. You must specify either this parameter or callId. You cannot specify both or leave both empty. The value must start with report- and be 1 to 64 characters in length. It can contain only ASCII letters, digits, underscores (_), and hyphens (-). The value is case-sensitive, and leading and trailing spaces are not trimmed. If the format is invalid, InvalidParameter.ReportId is returned. If both parameters are specified or left empty, InvalidParameter.ReportReference is returned. You can only query reports that belong to the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>report-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a</p>
     */
    @NameInMap("reportId")
    public String reportId;

    public static GetAiReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiReportRequest self = new GetAiReportRequest();
        return TeaModel.build(map, self);
    }

    public GetAiReportRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public GetAiReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
