// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadAllTypeRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadAllTypeRecordingResponseBody body;

    public static DownloadAllTypeRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadAllTypeRecordingResponse self = new DownloadAllTypeRecordingResponse();
        return TeaModel.build(map, self);
    }

    public DownloadAllTypeRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadAllTypeRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadAllTypeRecordingResponse setBody(DownloadAllTypeRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadAllTypeRecordingResponseBody getBody() {
        return this.body;
    }

}
