// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateFlowAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFlowAliasResponseBody body;

    public static UpdateFlowAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowAliasResponse self = new UpdateFlowAliasResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlowAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlowAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFlowAliasResponse setBody(UpdateFlowAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlowAliasResponseBody getBody() {
        return this.body;
    }

}
