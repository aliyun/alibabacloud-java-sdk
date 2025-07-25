// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKVvDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRTSNativeSDKVvDataResponseBody body;

    public static DescribeRTSNativeSDKVvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKVvDataResponse self = new DescribeRTSNativeSDKVvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKVvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRTSNativeSDKVvDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRTSNativeSDKVvDataResponse setBody(DescribeRTSNativeSDKVvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRTSNativeSDKVvDataResponseBody getBody() {
        return this.body;
    }

}
