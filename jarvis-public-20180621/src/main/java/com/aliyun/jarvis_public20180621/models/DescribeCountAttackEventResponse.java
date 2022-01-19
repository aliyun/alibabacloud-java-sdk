// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeCountAttackEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCountAttackEventResponseBody body;

    public static DescribeCountAttackEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCountAttackEventResponse self = new DescribeCountAttackEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCountAttackEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCountAttackEventResponse setBody(DescribeCountAttackEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCountAttackEventResponseBody getBody() {
        return this.body;
    }

}
