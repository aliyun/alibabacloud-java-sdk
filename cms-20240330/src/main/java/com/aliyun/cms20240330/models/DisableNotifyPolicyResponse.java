// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisableNotifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableNotifyPolicyResponseBody body;

    public static DisableNotifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableNotifyPolicyResponse self = new DisableNotifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DisableNotifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableNotifyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableNotifyPolicyResponse setBody(DisableNotifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableNotifyPolicyResponseBody getBody() {
        return this.body;
    }

}
