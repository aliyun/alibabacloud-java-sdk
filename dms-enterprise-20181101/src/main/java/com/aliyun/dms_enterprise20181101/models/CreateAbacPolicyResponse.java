// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateAbacPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAbacPolicyResponseBody body;

    public static CreateAbacPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAbacPolicyResponse self = new CreateAbacPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAbacPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAbacPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAbacPolicyResponse setBody(CreateAbacPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAbacPolicyResponseBody getBody() {
        return this.body;
    }

}
