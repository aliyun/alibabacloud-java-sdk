// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CountTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CountTextResponseBody body;

    public static CountTextResponse build(java.util.Map<String, ?> map) throws Exception {
        CountTextResponse self = new CountTextResponse();
        return TeaModel.build(map, self);
    }

    public CountTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountTextResponse setBody(CountTextResponseBody body) {
        this.body = body;
        return this;
    }
    public CountTextResponseBody getBody() {
        return this.body;
    }

}
