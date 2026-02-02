// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateReportTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>crt-xxx</p>
     */
    @NameInMap("ReportTemplateId")
    public String reportTemplateId;

    /**
     * <strong>example:</strong>
     * <p>A7A0FFF8-0B44-40C6-8BBF-3A185EFDF3F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateReportTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportTemplateResponseBody self = new UpdateReportTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateReportTemplateResponseBody setReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
        return this;
    }
    public String getReportTemplateId() {
        return this.reportTemplateId;
    }

    public UpdateReportTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
