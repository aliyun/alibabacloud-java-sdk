// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKPlayFailStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRTSNativeSDKPlayFailStatusResponseBody body;

    public static DescribeRTSNativeSDKPlayFailStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKPlayFailStatusResponse self = new DescribeRTSNativeSDKPlayFailStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKPlayFailStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRTSNativeSDKPlayFailStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRTSNativeSDKPlayFailStatusResponse setBody(DescribeRTSNativeSDKPlayFailStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRTSNativeSDKPlayFailStatusResponseBody getBody() {
        return this.body;
    }

}
