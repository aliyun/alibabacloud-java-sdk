// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListDialogueTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDialogueTemplateResponseBody body;

    public static ListDialogueTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDialogueTemplateResponse self = new ListDialogueTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListDialogueTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDialogueTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDialogueTemplateResponse setBody(ListDialogueTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDialogueTemplateResponseBody getBody() {
        return this.body;
    }

}
