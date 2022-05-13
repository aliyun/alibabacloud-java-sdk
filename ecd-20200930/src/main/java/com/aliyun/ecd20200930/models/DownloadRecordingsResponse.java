// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DownloadRecordingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadRecordingsResponseBody body;

    public static DownloadRecordingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadRecordingsResponse self = new DownloadRecordingsResponse();
        return TeaModel.build(map, self);
    }

    public DownloadRecordingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadRecordingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadRecordingsResponse setBody(DownloadRecordingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadRecordingsResponseBody getBody() {
        return this.body;
    }

}
