// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AskLumaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AskLumaResponseBody body;

    public static AskLumaResponse build(java.util.Map<String, ?> map) throws Exception {
        AskLumaResponse self = new AskLumaResponse();
        return TeaModel.build(map, self);
    }

    public AskLumaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AskLumaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AskLumaResponse setBody(AskLumaResponseBody body) {
        this.body = body;
        return this;
    }
    public AskLumaResponseBody getBody() {
        return this.body;
    }

}
