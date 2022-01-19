// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeAttackEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAttackEventResponseBody body;

    public static DescribeAttackEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackEventResponse self = new DescribeAttackEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttackEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttackEventResponse setBody(DescribeAttackEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttackEventResponseBody getBody() {
        return this.body;
    }

}
