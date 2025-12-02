// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeMVRecommendResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMVRecommendResultsResponseBody body;

    public static DescribeMVRecommendResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMVRecommendResultsResponse self = new DescribeMVRecommendResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMVRecommendResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMVRecommendResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMVRecommendResultsResponse setBody(DescribeMVRecommendResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMVRecommendResultsResponseBody getBody() {
        return this.body;
    }

}
