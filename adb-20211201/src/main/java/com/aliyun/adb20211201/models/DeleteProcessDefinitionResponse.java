// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteProcessDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProcessDefinitionResponseBody body;

    public static DeleteProcessDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProcessDefinitionResponse self = new DeleteProcessDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProcessDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProcessDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProcessDefinitionResponse setBody(DeleteProcessDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProcessDefinitionResponseBody getBody() {
        return this.body;
    }

}
