// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListRiskCheckResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRiskCheckResultsResponseBody body;

    public static ListRiskCheckResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRiskCheckResultsResponse self = new ListRiskCheckResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListRiskCheckResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRiskCheckResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRiskCheckResultsResponse setBody(ListRiskCheckResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRiskCheckResultsResponseBody getBody() {
        return this.body;
    }

}
