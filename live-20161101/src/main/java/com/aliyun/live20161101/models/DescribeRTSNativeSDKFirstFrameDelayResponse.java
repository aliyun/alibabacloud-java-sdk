// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKFirstFrameDelayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRTSNativeSDKFirstFrameDelayResponseBody body;

    public static DescribeRTSNativeSDKFirstFrameDelayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKFirstFrameDelayResponse self = new DescribeRTSNativeSDKFirstFrameDelayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKFirstFrameDelayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRTSNativeSDKFirstFrameDelayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRTSNativeSDKFirstFrameDelayResponse setBody(DescribeRTSNativeSDKFirstFrameDelayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRTSNativeSDKFirstFrameDelayResponseBody getBody() {
        return this.body;
    }

}
