// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsZoneOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInterAuthStatisticsZoneOverviewResponseBody body;

    public static DescribeInterAuthStatisticsZoneOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsZoneOverviewResponse self = new DescribeInterAuthStatisticsZoneOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsZoneOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInterAuthStatisticsZoneOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInterAuthStatisticsZoneOverviewResponse setBody(DescribeInterAuthStatisticsZoneOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInterAuthStatisticsZoneOverviewResponseBody getBody() {
        return this.body;
    }

}
