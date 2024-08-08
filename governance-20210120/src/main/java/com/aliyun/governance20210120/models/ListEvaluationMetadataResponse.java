// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEvaluationMetadataResponseBody body;

    public static ListEvaluationMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationMetadataResponse self = new ListEvaluationMetadataResponse();
        return TeaModel.build(map, self);
    }

    public ListEvaluationMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEvaluationMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEvaluationMetadataResponse setBody(ListEvaluationMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEvaluationMetadataResponseBody getBody() {
        return this.body;
    }

}
