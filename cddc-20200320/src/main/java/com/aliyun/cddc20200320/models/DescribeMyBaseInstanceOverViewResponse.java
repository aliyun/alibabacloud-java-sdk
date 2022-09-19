// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeMyBaseInstanceOverViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMyBaseInstanceOverViewResponseBody body;

    public static DescribeMyBaseInstanceOverViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyBaseInstanceOverViewResponse self = new DescribeMyBaseInstanceOverViewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMyBaseInstanceOverViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMyBaseInstanceOverViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMyBaseInstanceOverViewResponse setBody(DescribeMyBaseInstanceOverViewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMyBaseInstanceOverViewResponseBody getBody() {
        return this.body;
    }

}
