// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteAuthorityTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAuthorityTemplateResponseBody body;

    public static DeleteAuthorityTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorityTemplateResponse self = new DeleteAuthorityTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorityTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthorityTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuthorityTemplateResponse setBody(DeleteAuthorityTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthorityTemplateResponseBody getBody() {
        return this.body;
    }

}
