// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateConfigRulesReportResponseBody extends TeaModel {
    /**
     * <p>The ID of the compliance evaluation report.</p>
     * 
     * <strong>example:</strong>
     * <p>crp-88176457e0d900c9****</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateConfigRulesReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateConfigRulesReportResponseBody self = new GenerateConfigRulesReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateConfigRulesReportResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GenerateConfigRulesReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
