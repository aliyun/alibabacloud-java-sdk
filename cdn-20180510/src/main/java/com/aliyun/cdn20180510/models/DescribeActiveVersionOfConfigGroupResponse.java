// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeActiveVersionOfConfigGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeActiveVersionOfConfigGroupResponseBody body;

    public static DescribeActiveVersionOfConfigGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveVersionOfConfigGroupResponse self = new DescribeActiveVersionOfConfigGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveVersionOfConfigGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveVersionOfConfigGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActiveVersionOfConfigGroupResponse setBody(DescribeActiveVersionOfConfigGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveVersionOfConfigGroupResponseBody getBody() {
        return this.body;
    }

}
