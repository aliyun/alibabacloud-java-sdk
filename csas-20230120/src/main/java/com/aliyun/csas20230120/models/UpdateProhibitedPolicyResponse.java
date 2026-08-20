// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateProhibitedPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProhibitedPolicyResponseBody body;

    public static UpdateProhibitedPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProhibitedPolicyResponse self = new UpdateProhibitedPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProhibitedPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProhibitedPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProhibitedPolicyResponse setBody(UpdateProhibitedPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProhibitedPolicyResponseBody getBody() {
        return this.body;
    }

}
