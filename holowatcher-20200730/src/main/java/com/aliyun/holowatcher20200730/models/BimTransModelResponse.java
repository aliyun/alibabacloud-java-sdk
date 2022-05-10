// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimTransModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BimTransModelResponseBody body;

    public static BimTransModelResponse build(java.util.Map<String, ?> map) throws Exception {
        BimTransModelResponse self = new BimTransModelResponse();
        return TeaModel.build(map, self);
    }

    public BimTransModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimTransModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BimTransModelResponse setBody(BimTransModelResponseBody body) {
        this.body = body;
        return this;
    }
    public BimTransModelResponseBody getBody() {
        return this.body;
    }

}
