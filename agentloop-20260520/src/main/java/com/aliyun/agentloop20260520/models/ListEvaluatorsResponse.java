// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluatorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEvaluatorsResponseBody body;

    public static ListEvaluatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluatorsResponse self = new ListEvaluatorsResponse();
        return TeaModel.build(map, self);
    }

    public ListEvaluatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEvaluatorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEvaluatorsResponse setBody(ListEvaluatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEvaluatorsResponseBody getBody() {
        return this.body;
    }

}
