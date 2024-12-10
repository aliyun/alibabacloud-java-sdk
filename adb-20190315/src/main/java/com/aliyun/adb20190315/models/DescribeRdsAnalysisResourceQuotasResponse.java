// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeRdsAnalysisResourceQuotasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRdsAnalysisResourceQuotasResponseBody body;

    public static DescribeRdsAnalysisResourceQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsAnalysisResourceQuotasResponse self = new DescribeRdsAnalysisResourceQuotasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsAnalysisResourceQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsAnalysisResourceQuotasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdsAnalysisResourceQuotasResponse setBody(DescribeRdsAnalysisResourceQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsAnalysisResourceQuotasResponseBody getBody() {
        return this.body;
    }

}
