// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class AppFailBackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AppFailBackResponseBody body;

    public static AppFailBackResponse build(java.util.Map<String, ?> map) throws Exception {
        AppFailBackResponse self = new AppFailBackResponse();
        return TeaModel.build(map, self);
    }

    public AppFailBackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppFailBackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppFailBackResponse setBody(AppFailBackResponseBody body) {
        this.body = body;
        return this;
    }
    public AppFailBackResponseBody getBody() {
        return this.body;
    }

}
