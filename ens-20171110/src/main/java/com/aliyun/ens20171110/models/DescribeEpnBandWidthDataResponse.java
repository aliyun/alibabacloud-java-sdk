// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandWidthDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEpnBandWidthDataResponseBody body;

    public static DescribeEpnBandWidthDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnBandWidthDataResponse self = new DescribeEpnBandWidthDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnBandWidthDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEpnBandWidthDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEpnBandWidthDataResponse setBody(DescribeEpnBandWidthDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEpnBandWidthDataResponseBody getBody() {
        return this.body;
    }

}
