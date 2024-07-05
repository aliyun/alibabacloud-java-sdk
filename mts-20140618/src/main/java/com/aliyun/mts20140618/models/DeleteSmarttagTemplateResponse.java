// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteSmarttagTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSmarttagTemplateResponseBody body;

    public static DeleteSmarttagTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmarttagTemplateResponse self = new DeleteSmarttagTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSmarttagTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSmarttagTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSmarttagTemplateResponse setBody(DeleteSmarttagTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSmarttagTemplateResponseBody getBody() {
        return this.body;
    }

}
