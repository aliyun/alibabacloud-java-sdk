// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteConfigTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConfigTemplateResponseBody body;

    public static DeleteConfigTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigTemplateResponse self = new DeleteConfigTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConfigTemplateResponse setBody(DeleteConfigTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigTemplateResponseBody getBody() {
        return this.body;
    }

}
