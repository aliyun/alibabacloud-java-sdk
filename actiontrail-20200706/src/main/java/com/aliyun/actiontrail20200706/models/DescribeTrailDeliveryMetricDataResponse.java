// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeTrailDeliveryMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTrailDeliveryMetricDataResponseBody body;

    public static DescribeTrailDeliveryMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrailDeliveryMetricDataResponse self = new DescribeTrailDeliveryMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrailDeliveryMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrailDeliveryMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrailDeliveryMetricDataResponse setBody(DescribeTrailDeliveryMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrailDeliveryMetricDataResponseBody getBody() {
        return this.body;
    }

}
