// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceDropPacketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceDropPacketResponseBody body;

    public static DescribeInstanceDropPacketResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDropPacketResponse self = new DescribeInstanceDropPacketResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDropPacketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceDropPacketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceDropPacketResponse setBody(DescribeInstanceDropPacketResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDropPacketResponseBody getBody() {
        return this.body;
    }

}
