// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomEventCountResponseBody body;

    public static DescribeCustomEventCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventCountResponse self = new DescribeCustomEventCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomEventCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomEventCountResponse setBody(DescribeCustomEventCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomEventCountResponseBody getBody() {
        return this.body;
    }

}
