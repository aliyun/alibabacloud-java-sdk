// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRulesReportRequest extends TeaModel {
    /**
     * <p>The ID of the compliance evaluation report.</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    public static GetConfigRulesReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRulesReportRequest self = new GetConfigRulesReportRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigRulesReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
