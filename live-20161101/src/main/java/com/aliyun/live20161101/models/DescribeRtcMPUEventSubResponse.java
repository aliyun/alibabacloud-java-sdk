// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRtcMPUEventSubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRtcMPUEventSubResponseBody body;

    public static DescribeRtcMPUEventSubResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcMPUEventSubResponse self = new DescribeRtcMPUEventSubResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcMPUEventSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcMPUEventSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcMPUEventSubResponse setBody(DescribeRtcMPUEventSubResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcMPUEventSubResponseBody getBody() {
        return this.body;
    }

}
