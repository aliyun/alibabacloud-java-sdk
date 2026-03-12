// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class DeleteContactTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContactTemplateResponseBody body;

    public static DeleteContactTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactTemplateResponse self = new DeleteContactTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContactTemplateResponse setBody(DeleteContactTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactTemplateResponseBody getBody() {
        return this.body;
    }

}
