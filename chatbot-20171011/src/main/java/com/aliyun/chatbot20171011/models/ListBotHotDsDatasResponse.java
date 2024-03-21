// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotHotDsDatasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListBotHotDsDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBotHotDsDatasResponse setBody(ListBotHotDsDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotHotDsDatasResponseBody getBody() {
        return this.body;
    }

}
