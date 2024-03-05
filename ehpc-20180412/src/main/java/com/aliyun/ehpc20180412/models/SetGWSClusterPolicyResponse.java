// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSClusterPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetGWSClusterPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetGWSClusterPolicyResponse setBody(SetGWSClusterPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGWSClusterPolicyResponseBody getBody() {
        return this.body;
    }

}
