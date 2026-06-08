// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteProcessDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
