// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeBusinessAnalysisDataListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBusinessAnalysisDataListResponseBody body;

    public static DescribeBusinessAnalysisDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBusinessAnalysisDataListResponse self = new DescribeBusinessAnalysisDataListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBusinessAnalysisDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBusinessAnalysisDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBusinessAnalysisDataListResponse setBody(DescribeBusinessAnalysisDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBusinessAnalysisDataListResponseBody getBody() {
        return this.body;
    }

}
