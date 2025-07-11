// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatFlowTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatFlowTemplateResponseBody body;

    public static ListChatFlowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatFlowTemplateResponse self = new ListChatFlowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListChatFlowTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatFlowTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatFlowTemplateResponse setBody(ListChatFlowTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatFlowTemplateResponseBody getBody() {
        return this.body;
    }

}
