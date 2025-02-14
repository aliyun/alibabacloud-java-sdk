// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPolicyAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPolicyAttachmentResponseBody body;

    public static GetPolicyAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyAttachmentResponse self = new GetPolicyAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolicyAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolicyAttachmentResponse setBody(GetPolicyAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicyAttachmentResponseBody getBody() {
        return this.body;
    }

}
