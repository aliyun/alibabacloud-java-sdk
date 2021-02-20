// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandWidthDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeEpnBandWidthDataResponse setBody(DescribeEpnBandWidthDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEpnBandWidthDataResponseBody getBody() {
        return this.body;
    }

}
