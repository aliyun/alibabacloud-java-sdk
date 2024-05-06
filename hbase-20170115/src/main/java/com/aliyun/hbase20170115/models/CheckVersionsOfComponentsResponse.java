// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CheckVersionsOfComponentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckVersionsOfComponentsResponseBody body;

    public static CheckVersionsOfComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckVersionsOfComponentsResponse self = new CheckVersionsOfComponentsResponse();
        return TeaModel.build(map, self);
    }

    public CheckVersionsOfComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckVersionsOfComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckVersionsOfComponentsResponse setBody(CheckVersionsOfComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckVersionsOfComponentsResponseBody getBody() {
        return this.body;
    }

}
