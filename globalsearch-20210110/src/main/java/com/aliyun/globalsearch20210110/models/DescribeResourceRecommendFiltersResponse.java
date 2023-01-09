// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeResourceRecommendFiltersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceRecommendFiltersResponseBody body;

    public static DescribeResourceRecommendFiltersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceRecommendFiltersResponse self = new DescribeResourceRecommendFiltersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceRecommendFiltersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceRecommendFiltersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceRecommendFiltersResponse setBody(DescribeResourceRecommendFiltersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceRecommendFiltersResponseBody getBody() {
        return this.body;
    }

}
