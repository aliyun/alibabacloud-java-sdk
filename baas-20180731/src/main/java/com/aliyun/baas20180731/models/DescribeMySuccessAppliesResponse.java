// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMySuccessAppliesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMySuccessAppliesResponseBody body;

    public static DescribeMySuccessAppliesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMySuccessAppliesResponse self = new DescribeMySuccessAppliesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMySuccessAppliesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMySuccessAppliesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMySuccessAppliesResponse setBody(DescribeMySuccessAppliesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMySuccessAppliesResponseBody getBody() {
        return this.body;
    }

}
