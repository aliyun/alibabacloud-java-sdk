// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteSystemPropertyTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSystemPropertyTemplatesResponseBody body;

    public static DeleteSystemPropertyTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSystemPropertyTemplatesResponse self = new DeleteSystemPropertyTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSystemPropertyTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSystemPropertyTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSystemPropertyTemplatesResponse setBody(DeleteSystemPropertyTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSystemPropertyTemplatesResponseBody getBody() {
        return this.body;
    }

}
