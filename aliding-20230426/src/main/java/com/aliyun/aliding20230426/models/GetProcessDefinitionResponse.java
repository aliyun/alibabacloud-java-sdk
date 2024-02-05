// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetProcessDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProcessDefinitionResponseBody body;

    public static GetProcessDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProcessDefinitionResponse self = new GetProcessDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public GetProcessDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProcessDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProcessDefinitionResponse setBody(GetProcessDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProcessDefinitionResponseBody getBody() {
        return this.body;
    }

}
