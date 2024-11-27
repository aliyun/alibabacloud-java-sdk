// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateAbacPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAbacPolicyResponseBody body;

    public static UpdateAbacPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAbacPolicyResponse self = new UpdateAbacPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAbacPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAbacPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAbacPolicyResponse setBody(UpdateAbacPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAbacPolicyResponseBody getBody() {
        return this.body;
    }

}
