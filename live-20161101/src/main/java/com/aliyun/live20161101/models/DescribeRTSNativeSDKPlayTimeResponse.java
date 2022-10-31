// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKPlayTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRTSNativeSDKPlayTimeResponseBody body;

    public static DescribeRTSNativeSDKPlayTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKPlayTimeResponse self = new DescribeRTSNativeSDKPlayTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKPlayTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRTSNativeSDKPlayTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRTSNativeSDKPlayTimeResponse setBody(DescribeRTSNativeSDKPlayTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRTSNativeSDKPlayTimeResponseBody getBody() {
        return this.body;
    }

}
