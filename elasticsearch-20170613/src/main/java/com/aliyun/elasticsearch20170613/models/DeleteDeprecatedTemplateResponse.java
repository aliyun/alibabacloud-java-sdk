// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteDeprecatedTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeprecatedTemplateResponseBody body;

    public static DeleteDeprecatedTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeprecatedTemplateResponse self = new DeleteDeprecatedTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeprecatedTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeprecatedTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeprecatedTemplateResponse setBody(DeleteDeprecatedTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeprecatedTemplateResponseBody getBody() {
        return this.body;
    }

}
