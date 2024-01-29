// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class NluResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NluResponseBody body;

    public static NluResponse build(java.util.Map<String, ?> map) throws Exception {
        NluResponse self = new NluResponse();
        return TeaModel.build(map, self);
    }

    public NluResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NluResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NluResponse setBody(NluResponseBody body) {
        this.body = body;
        return this;
    }
    public NluResponseBody getBody() {
        return this.body;
    }

}
