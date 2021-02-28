// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotColdDsDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBotColdDsDatasResponseBody body;

    public static ListBotColdDsDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBotColdDsDatasResponse self = new ListBotColdDsDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListBotColdDsDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBotColdDsDatasResponse setBody(ListBotColdDsDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotColdDsDatasResponseBody getBody() {
        return this.body;
    }

}
