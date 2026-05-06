// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteLlmTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLlmTemplateResponseBody body;

    public static DeleteLlmTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLlmTemplateResponse self = new DeleteLlmTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLlmTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLlmTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLlmTemplateResponse setBody(DeleteLlmTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLlmTemplateResponseBody getBody() {
        return this.body;
    }

}
