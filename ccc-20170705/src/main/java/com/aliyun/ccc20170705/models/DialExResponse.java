// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DialExResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DialExResponseBody body;

    public static DialExResponse build(java.util.Map<String, ?> map) throws Exception {
        DialExResponse self = new DialExResponse();
        return TeaModel.build(map, self);
    }

    public DialExResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DialExResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DialExResponse setBody(DialExResponseBody body) {
        this.body = body;
        return this;
    }
    public DialExResponseBody getBody() {
        return this.body;
    }

}
