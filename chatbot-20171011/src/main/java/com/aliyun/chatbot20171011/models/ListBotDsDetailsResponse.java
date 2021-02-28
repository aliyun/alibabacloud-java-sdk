// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotDsDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBotDsDetailsResponseBody body;

    public static ListBotDsDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBotDsDetailsResponse self = new ListBotDsDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListBotDsDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBotDsDetailsResponse setBody(ListBotDsDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotDsDetailsResponseBody getBody() {
        return this.body;
    }

}
