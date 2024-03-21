// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotDsStatDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBotDsStatDataResponseBody body;

    public static GetBotDsStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBotDsStatDataResponse self = new GetBotDsStatDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBotDsStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBotDsStatDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBotDsStatDataResponse setBody(GetBotDsStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBotDsStatDataResponseBody getBody() {
        return this.body;
    }

}
