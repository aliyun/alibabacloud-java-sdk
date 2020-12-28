// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSClusterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetGWSClusterPolicyResponseBody body;

    public static SetGWSClusterPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGWSClusterPolicyResponse self = new SetGWSClusterPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetGWSClusterPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGWSClusterPolicyResponse setBody(SetGWSClusterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGWSClusterPolicyResponseBody getBody() {
        return this.body;
    }

}
