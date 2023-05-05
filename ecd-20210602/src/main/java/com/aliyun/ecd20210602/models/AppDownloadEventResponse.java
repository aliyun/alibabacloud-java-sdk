// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class AppDownloadEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AppDownloadEventResponseBody body;

    public static AppDownloadEventResponse build(java.util.Map<String, ?> map) throws Exception {
        AppDownloadEventResponse self = new AppDownloadEventResponse();
        return TeaModel.build(map, self);
    }

    public AppDownloadEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppDownloadEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppDownloadEventResponse setBody(AppDownloadEventResponseBody body) {
        this.body = body;
        return this;
    }
    public AppDownloadEventResponseBody getBody() {
        return this.body;
    }

}
