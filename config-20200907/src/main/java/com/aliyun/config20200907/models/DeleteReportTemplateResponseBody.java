// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteReportTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the report template.</p>
     * 
     * <strong>example:</strong>
     * <p>crt-xxx</p>
     */
    @NameInMap("ReportTemplateId")
    public String reportTemplateId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DE9FFFE5-FCAD-4B24-9546-BF49273C562B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteReportTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteReportTemplateResponseBody self = new DeleteReportTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteReportTemplateResponseBody setReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
        return this;
    }
    public String getReportTemplateId() {
        return this.reportTemplateId;
    }

    public DeleteReportTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
