// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetProhibitedPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProhibitedPolicyResponseBody body;

    public static GetProhibitedPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProhibitedPolicyResponse self = new GetProhibitedPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetProhibitedPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProhibitedPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProhibitedPolicyResponse setBody(GetProhibitedPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProhibitedPolicyResponseBody getBody() {
        return this.body;
    }

}
