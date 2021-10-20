// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DownloadDiagnosisRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DownloadDiagnosisRecordsResponse setBody(DownloadDiagnosisRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadDiagnosisRecordsResponseBody getBody() {
        return this.body;
    }

}
