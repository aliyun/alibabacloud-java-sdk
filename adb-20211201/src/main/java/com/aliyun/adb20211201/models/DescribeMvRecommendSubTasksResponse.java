// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeMvRecommendSubTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMvRecommendSubTasksResponseBody body;

    public static DescribeMvRecommendSubTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMvRecommendSubTasksResponse self = new DescribeMvRecommendSubTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMvRecommendSubTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMvRecommendSubTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMvRecommendSubTasksResponse setBody(DescribeMvRecommendSubTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMvRecommendSubTasksResponseBody getBody() {
        return this.body;
    }

}
