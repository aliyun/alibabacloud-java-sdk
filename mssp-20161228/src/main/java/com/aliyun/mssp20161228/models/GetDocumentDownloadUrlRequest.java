// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDocumentDownloadUrlRequest extends TeaModel {
    /**
     * <p>Document management ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>175815</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("ReportType")
    public String reportType;

    public static GetDocumentDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentDownloadUrlRequest self = new GetDocumentDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentDownloadUrlRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDocumentDownloadUrlRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

}
