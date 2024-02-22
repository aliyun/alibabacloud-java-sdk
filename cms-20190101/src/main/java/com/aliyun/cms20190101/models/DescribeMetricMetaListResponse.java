// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetricMetaListResponseBody body;

    public static DescribeMetricMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricMetaListResponse self = new DescribeMetricMetaListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricMetaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricMetaListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricMetaListResponse setBody(DescribeMetricMetaListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricMetaListResponseBody getBody() {
        return this.body;
    }

}
