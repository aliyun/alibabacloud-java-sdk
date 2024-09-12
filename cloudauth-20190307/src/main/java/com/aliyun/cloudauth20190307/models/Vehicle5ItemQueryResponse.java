// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Vehicle5ItemQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Vehicle5ItemQueryResponseBody body;

    public static Vehicle5ItemQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        Vehicle5ItemQueryResponse self = new Vehicle5ItemQueryResponse();
        return TeaModel.build(map, self);
    }

    public Vehicle5ItemQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Vehicle5ItemQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Vehicle5ItemQueryResponse setBody(Vehicle5ItemQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public Vehicle5ItemQueryResponseBody getBody() {
        return this.body;
    }

}
