// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class AppFailOverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AppFailOverResponseBody body;

    public static AppFailOverResponse build(java.util.Map<String, ?> map) throws Exception {
        AppFailOverResponse self = new AppFailOverResponse();
        return TeaModel.build(map, self);
    }

    public AppFailOverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppFailOverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppFailOverResponse setBody(AppFailOverResponseBody body) {
        this.body = body;
        return this;
    }
    public AppFailOverResponseBody getBody() {
        return this.body;
    }

}
