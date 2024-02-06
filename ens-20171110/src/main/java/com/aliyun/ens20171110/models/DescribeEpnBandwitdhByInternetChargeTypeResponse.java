// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandwitdhByInternetChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEpnBandwitdhByInternetChargeTypeResponseBody body;

    public static DescribeEpnBandwitdhByInternetChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnBandwitdhByInternetChargeTypeResponse self = new DescribeEpnBandwitdhByInternetChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse setBody(DescribeEpnBandwitdhByInternetChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEpnBandwitdhByInternetChargeTypeResponseBody getBody() {
        return this.body;
    }

}
