// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompareFaceResponseBody body;

    public static CompareFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceResponse self = new CompareFaceResponse();
        return TeaModel.build(map, self);
    }

    public CompareFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompareFaceResponse setBody(CompareFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareFaceResponseBody getBody() {
        return this.body;
    }

}
