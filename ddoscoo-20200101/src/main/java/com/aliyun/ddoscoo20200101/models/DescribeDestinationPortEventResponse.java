// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDestinationPortEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDestinationPortEventResponseBody body;

    public static DescribeDestinationPortEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDestinationPortEventResponse self = new DescribeDestinationPortEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDestinationPortEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDestinationPortEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDestinationPortEventResponse setBody(DescribeDestinationPortEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDestinationPortEventResponseBody getBody() {
        return this.body;
    }

}
