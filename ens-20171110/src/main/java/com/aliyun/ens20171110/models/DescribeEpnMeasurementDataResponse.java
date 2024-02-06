// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnMeasurementDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEpnMeasurementDataResponseBody body;

    public static DescribeEpnMeasurementDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnMeasurementDataResponse self = new DescribeEpnMeasurementDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnMeasurementDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEpnMeasurementDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEpnMeasurementDataResponse setBody(DescribeEpnMeasurementDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEpnMeasurementDataResponseBody getBody() {
        return this.body;
    }

}
