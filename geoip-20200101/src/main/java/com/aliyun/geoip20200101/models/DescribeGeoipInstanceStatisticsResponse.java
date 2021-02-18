// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGeoipInstanceStatisticsResponseBody body;

    public static DescribeGeoipInstanceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceStatisticsResponse self = new DescribeGeoipInstanceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGeoipInstanceStatisticsResponse setBody(DescribeGeoipInstanceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGeoipInstanceStatisticsResponseBody getBody() {
        return this.body;
    }

}
