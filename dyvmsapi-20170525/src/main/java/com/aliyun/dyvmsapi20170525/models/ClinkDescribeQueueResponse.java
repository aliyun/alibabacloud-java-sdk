// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkDescribeQueueResponseBody body;

    public static ClinkDescribeQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeQueueResponse self = new ClinkDescribeQueueResponse();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkDescribeQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkDescribeQueueResponse setBody(ClinkDescribeQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkDescribeQueueResponseBody getBody() {
        return this.body;
    }

}
