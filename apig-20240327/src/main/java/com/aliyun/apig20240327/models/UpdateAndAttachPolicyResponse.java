// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAndAttachPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAndAttachPolicyResponseBody body;

    public static UpdateAndAttachPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndAttachPolicyResponse self = new UpdateAndAttachPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAndAttachPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAndAttachPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAndAttachPolicyResponse setBody(UpdateAndAttachPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAndAttachPolicyResponseBody getBody() {
        return this.body;
    }

}
