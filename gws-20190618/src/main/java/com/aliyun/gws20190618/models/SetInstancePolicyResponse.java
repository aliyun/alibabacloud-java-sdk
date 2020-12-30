// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetInstancePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetInstancePolicyResponseBody body;

    public static SetInstancePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstancePolicyResponse self = new SetInstancePolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetInstancePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstancePolicyResponse setBody(SetInstancePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstancePolicyResponseBody getBody() {
        return this.body;
    }

}
