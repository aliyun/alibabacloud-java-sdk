// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDemandsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDemandsResponseBody body;

    public static DescribeDemandsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDemandsResponse self = new DescribeDemandsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDemandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDemandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDemandsResponse setBody(DescribeDemandsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDemandsResponseBody getBody() {
        return this.body;
    }

}
