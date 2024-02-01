// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteTimeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTimeTemplateResponseBody body;

    public static DeleteTimeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTimeTemplateResponse self = new DeleteTimeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTimeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTimeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTimeTemplateResponse setBody(DeleteTimeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTimeTemplateResponseBody getBody() {
        return this.body;
    }

}
