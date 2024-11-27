// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAbacPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAbacPolicyResponseBody body;

    public static GetAbacPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAbacPolicyResponse self = new GetAbacPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetAbacPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAbacPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAbacPolicyResponse setBody(GetAbacPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAbacPolicyResponseBody getBody() {
        return this.body;
    }

}
