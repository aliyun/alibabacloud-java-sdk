// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatappTemplateResponseBody body;

    public static ListChatappTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatappTemplateResponse self = new ListChatappTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListChatappTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatappTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatappTemplateResponse setBody(ListChatappTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatappTemplateResponseBody getBody() {
        return this.body;
    }

}
