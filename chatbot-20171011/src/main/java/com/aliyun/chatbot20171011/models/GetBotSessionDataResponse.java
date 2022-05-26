// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotSessionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBotSessionDataResponseBody body;

    public static GetBotSessionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBotSessionDataResponse self = new GetBotSessionDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBotSessionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBotSessionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBotSessionDataResponse setBody(GetBotSessionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBotSessionDataResponseBody getBody() {
        return this.body;
    }

}
