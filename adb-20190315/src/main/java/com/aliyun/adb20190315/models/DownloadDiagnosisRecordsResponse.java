// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DownloadDiagnosisRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadDiagnosisRecordsResponseBody body;

    public static DownloadDiagnosisRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadDiagnosisRecordsResponse self = new DownloadDiagnosisRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DownloadDiagnosisRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadDiagnosisRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadDiagnosisRecordsResponse setBody(DownloadDiagnosisRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadDiagnosisRecordsResponseBody getBody() {
        return this.body;
    }

}
