// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsGlobalOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInterAuthStatisticsGlobalOverviewResponseBody body;

    public static DescribeInterAuthStatisticsGlobalOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsGlobalOverviewResponse self = new DescribeInterAuthStatisticsGlobalOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsGlobalOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInterAuthStatisticsGlobalOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInterAuthStatisticsGlobalOverviewResponse setBody(DescribeInterAuthStatisticsGlobalOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInterAuthStatisticsGlobalOverviewResponseBody getBody() {
        return this.body;
    }

}
