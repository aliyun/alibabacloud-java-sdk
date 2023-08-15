// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeNodeCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResizeNodeCountResponseBody body;

    public static ResizeNodeCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeNodeCountResponse self = new ResizeNodeCountResponse();
        return TeaModel.build(map, self);
    }

    public ResizeNodeCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeNodeCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeNodeCountResponse setBody(ResizeNodeCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeNodeCountResponseBody getBody() {
        return this.body;
    }

}
