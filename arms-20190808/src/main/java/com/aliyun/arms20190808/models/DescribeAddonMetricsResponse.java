// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeAddonMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAddonMetricsResponseBody body;

    public static DescribeAddonMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonMetricsResponse self = new DescribeAddonMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAddonMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAddonMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAddonMetricsResponse setBody(DescribeAddonMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAddonMetricsResponseBody getBody() {
        return this.body;
    }

}
