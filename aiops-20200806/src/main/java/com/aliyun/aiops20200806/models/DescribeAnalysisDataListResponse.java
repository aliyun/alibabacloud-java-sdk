// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAnalysisDataListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAnalysisDataListResponseBody body;

    public static DescribeAnalysisDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisDataListResponse self = new DescribeAnalysisDataListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnalysisDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAnalysisDataListResponse setBody(DescribeAnalysisDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnalysisDataListResponseBody getBody() {
        return this.body;
    }

}
