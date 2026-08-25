// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListPredefinedModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPredefinedModelsResponseBody body;

    public static ListPredefinedModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPredefinedModelsResponse self = new ListPredefinedModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListPredefinedModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPredefinedModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPredefinedModelsResponse setBody(ListPredefinedModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPredefinedModelsResponseBody getBody() {
        return this.body;
    }

}
