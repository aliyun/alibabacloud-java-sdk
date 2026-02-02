// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateReportTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>crt-xxx</p>
     */
    @NameInMap("ReportTemplateId")
    public String reportTemplateId;

    /**
     * <strong>example:</strong>
     * <p>A7A0FFF8-0B44-40C6-8BBF-3A185EFDFXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateReportTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReportTemplateResponseBody self = new CreateReportTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReportTemplateResponseBody setReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
        return this;
    }
    public String getReportTemplateId() {
        return this.reportTemplateId;
    }

    public CreateReportTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
