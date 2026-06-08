// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProcessDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProcessDefinitionResponseBody body;

    public static UpdateProcessDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProcessDefinitionResponse self = new UpdateProcessDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProcessDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProcessDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProcessDefinitionResponse setBody(UpdateProcessDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProcessDefinitionResponseBody getBody() {
        return this.body;
    }

}
