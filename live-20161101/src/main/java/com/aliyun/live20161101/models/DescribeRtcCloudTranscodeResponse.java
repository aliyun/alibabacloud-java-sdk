// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRtcCloudTranscodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRtcCloudTranscodeResponseBody body;

    public static DescribeRtcCloudTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcCloudTranscodeResponse self = new DescribeRtcCloudTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcCloudTranscodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcCloudTranscodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcCloudTranscodeResponse setBody(DescribeRtcCloudTranscodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcCloudTranscodeResponseBody getBody() {
        return this.body;
    }

}
