// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class AppInstallEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AppInstallEventResponseBody body;

    public static AppInstallEventResponse build(java.util.Map<String, ?> map) throws Exception {
        AppInstallEventResponse self = new AppInstallEventResponse();
        return TeaModel.build(map, self);
    }

    public AppInstallEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppInstallEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppInstallEventResponse setBody(AppInstallEventResponseBody body) {
        this.body = body;
        return this;
    }
    public AppInstallEventResponseBody getBody() {
        return this.body;
    }

}
