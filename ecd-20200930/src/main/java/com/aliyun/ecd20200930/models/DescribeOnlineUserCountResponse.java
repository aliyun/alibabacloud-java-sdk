// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOnlineUserCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOnlineUserCountResponseBody body;

    public static DescribeOnlineUserCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnlineUserCountResponse self = new DescribeOnlineUserCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOnlineUserCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOnlineUserCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOnlineUserCountResponse setBody(DescribeOnlineUserCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOnlineUserCountResponseBody getBody() {
        return this.body;
    }

}
