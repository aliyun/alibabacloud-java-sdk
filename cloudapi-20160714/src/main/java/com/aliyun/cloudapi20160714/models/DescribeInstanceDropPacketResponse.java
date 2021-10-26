// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceDropPacketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeInstanceDropPacketResponse setBody(DescribeInstanceDropPacketResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDropPacketResponseBody getBody() {
        return this.body;
    }

}
