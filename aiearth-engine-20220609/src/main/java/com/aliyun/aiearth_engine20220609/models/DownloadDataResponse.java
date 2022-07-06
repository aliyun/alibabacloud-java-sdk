// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DownloadDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadDataResponseBody body;

    public static DownloadDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadDataResponse self = new DownloadDataResponse();
        return TeaModel.build(map, self);
    }

    public DownloadDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadDataResponse setBody(DownloadDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadDataResponseBody getBody() {
        return this.body;
    }

}
