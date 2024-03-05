// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeAutoScaleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoScaleConfigResponseBody body;

    public static DescribeAutoScaleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScaleConfigResponse self = new DescribeAutoScaleConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScaleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoScaleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoScaleConfigResponse setBody(DescribeAutoScaleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoScaleConfigResponseBody getBody() {
        return this.body;
    }

}
