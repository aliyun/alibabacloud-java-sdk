// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotHotDsDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBotHotDsDatasResponseBody body;

    public static ListBotHotDsDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBotHotDsDatasResponse self = new ListBotHotDsDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListBotHotDsDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBotHotDsDatasResponse setBody(ListBotHotDsDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotHotDsDatasResponseBody getBody() {
        return this.body;
    }

}
