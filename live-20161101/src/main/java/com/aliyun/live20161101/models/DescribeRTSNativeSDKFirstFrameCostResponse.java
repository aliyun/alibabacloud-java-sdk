// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKFirstFrameCostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRTSNativeSDKFirstFrameCostResponseBody body;

    public static DescribeRTSNativeSDKFirstFrameCostResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKFirstFrameCostResponse self = new DescribeRTSNativeSDKFirstFrameCostResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKFirstFrameCostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRTSNativeSDKFirstFrameCostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRTSNativeSDKFirstFrameCostResponse setBody(DescribeRTSNativeSDKFirstFrameCostResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRTSNativeSDKFirstFrameCostResponseBody getBody() {
        return this.body;
    }

}
