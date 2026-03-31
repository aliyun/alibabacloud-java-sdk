// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteReportTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crt-xxx</p>
     */
    @NameInMap("ReportTemplateId")
    public String reportTemplateId;

    public static DeleteReportTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReportTemplateRequest self = new DeleteReportTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReportTemplateRequest setReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
        return this;
    }
    public String getReportTemplateId() {
        return this.reportTemplateId;
    }

}
