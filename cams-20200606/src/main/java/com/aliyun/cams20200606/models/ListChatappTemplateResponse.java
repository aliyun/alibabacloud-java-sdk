// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListChatappTemplateResponse setBody(ListChatappTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatappTemplateResponseBody getBody() {
        return this.body;
    }

}
