// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceEventResponseBody body;

    public static DescribeServiceEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceEventResponse self = new DescribeServiceEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceEventResponse setBody(DescribeServiceEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceEventResponseBody getBody() {
        return this.body;
    }

}
