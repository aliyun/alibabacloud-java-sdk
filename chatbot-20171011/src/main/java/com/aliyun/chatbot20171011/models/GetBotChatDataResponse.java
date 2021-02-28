// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotChatDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetBotChatDataResponse setBody(GetBotChatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBotChatDataResponseBody getBody() {
        return this.body;
    }

}
