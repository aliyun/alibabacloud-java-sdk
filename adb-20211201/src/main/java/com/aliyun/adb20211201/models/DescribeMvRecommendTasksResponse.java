// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeMvRecommendTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMvRecommendTasksResponseBody body;

    public static DescribeMvRecommendTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMvRecommendTasksResponse self = new DescribeMvRecommendTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMvRecommendTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMvRecommendTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMvRecommendTasksResponse setBody(DescribeMvRecommendTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMvRecommendTasksResponseBody getBody() {
        return this.body;
    }

}
