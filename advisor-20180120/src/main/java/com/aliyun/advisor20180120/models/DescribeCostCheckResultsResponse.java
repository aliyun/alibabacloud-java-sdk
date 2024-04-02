// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCostCheckResultsResponseBody body;

    public static DescribeCostCheckResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostCheckResultsResponse self = new DescribeCostCheckResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCostCheckResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCostCheckResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCostCheckResultsResponse setBody(DescribeCostCheckResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCostCheckResultsResponseBody getBody() {
        return this.body;
    }

}
