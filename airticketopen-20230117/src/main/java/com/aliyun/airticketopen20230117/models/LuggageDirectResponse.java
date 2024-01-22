// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class LuggageDirectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LuggageDirectResponseBody body;

    public static LuggageDirectResponse build(java.util.Map<String, ?> map) throws Exception {
        LuggageDirectResponse self = new LuggageDirectResponse();
        return TeaModel.build(map, self);
    }

    public LuggageDirectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LuggageDirectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LuggageDirectResponse setBody(LuggageDirectResponseBody body) {
        this.body = body;
        return this;
    }
    public LuggageDirectResponseBody getBody() {
        return this.body;
    }

}
