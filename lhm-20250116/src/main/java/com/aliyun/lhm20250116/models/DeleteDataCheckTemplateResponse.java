// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class DeleteDataCheckTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataCheckTemplateResponseBody body;

    public static DeleteDataCheckTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataCheckTemplateResponse self = new DeleteDataCheckTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataCheckTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataCheckTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataCheckTemplateResponse setBody(DeleteDataCheckTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataCheckTemplateResponseBody getBody() {
        return this.body;
    }

}
