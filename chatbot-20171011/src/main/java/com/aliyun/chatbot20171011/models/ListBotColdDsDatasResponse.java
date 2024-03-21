// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotColdDsDatasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListBotColdDsDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBotColdDsDatasResponse setBody(ListBotColdDsDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotColdDsDatasResponseBody getBody() {
        return this.body;
    }

}
