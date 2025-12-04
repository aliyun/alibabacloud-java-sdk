// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DescribeEmbodiedAIPlatformsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEmbodiedAIPlatformsResponseBody body;

    public static DescribeEmbodiedAIPlatformsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmbodiedAIPlatformsResponse self = new DescribeEmbodiedAIPlatformsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEmbodiedAIPlatformsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEmbodiedAIPlatformsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEmbodiedAIPlatformsResponse setBody(DescribeEmbodiedAIPlatformsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEmbodiedAIPlatformsResponseBody getBody() {
        return this.body;
    }

}
