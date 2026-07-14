// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnableNotifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableNotifyPolicyResponseBody body;

    public static EnableNotifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableNotifyPolicyResponse self = new EnableNotifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public EnableNotifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableNotifyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableNotifyPolicyResponse setBody(EnableNotifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableNotifyPolicyResponseBody getBody() {
        return this.body;
    }

}
