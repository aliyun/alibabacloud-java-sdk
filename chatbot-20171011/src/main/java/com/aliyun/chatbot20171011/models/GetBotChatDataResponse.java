// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotChatDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBotChatDataResponseBody body;

    public static GetBotChatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBotChatDataResponse self = new GetBotChatDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBotChatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBotChatDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBotChatDataResponse setBody(GetBotChatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBotChatDataResponseBody getBody() {
        return this.body;
    }

}
