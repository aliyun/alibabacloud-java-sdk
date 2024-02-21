// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteIndexTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIndexTemplateResponseBody body;

    public static DeleteIndexTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexTemplateResponse self = new DeleteIndexTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIndexTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIndexTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIndexTemplateResponse setBody(DeleteIndexTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIndexTemplateResponseBody getBody() {
        return this.body;
    }

}
