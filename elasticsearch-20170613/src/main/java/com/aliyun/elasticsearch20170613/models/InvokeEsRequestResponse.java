// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InvokeEsRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeEsRequestResponseBody body;

    public static InvokeEsRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeEsRequestResponse self = new InvokeEsRequestResponse();
        return TeaModel.build(map, self);
    }

    public InvokeEsRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeEsRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeEsRequestResponse setBody(InvokeEsRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeEsRequestResponseBody getBody() {
        return this.body;
    }

}
