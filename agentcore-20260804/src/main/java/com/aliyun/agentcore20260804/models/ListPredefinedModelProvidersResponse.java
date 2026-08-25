// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListPredefinedModelProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPredefinedModelProvidersResponseBody body;

    public static ListPredefinedModelProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPredefinedModelProvidersResponse self = new ListPredefinedModelProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListPredefinedModelProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPredefinedModelProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPredefinedModelProvidersResponse setBody(ListPredefinedModelProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPredefinedModelProvidersResponseBody getBody() {
        return this.body;
    }

}
