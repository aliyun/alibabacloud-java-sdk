// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetClusterPolicyResponseBody body;

    public static SetClusterPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetClusterPolicyResponse self = new SetClusterPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetClusterPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetClusterPolicyResponse setBody(SetClusterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetClusterPolicyResponseBody getBody() {
        return this.body;
    }

}
