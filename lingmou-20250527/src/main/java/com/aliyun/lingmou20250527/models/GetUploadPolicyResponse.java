// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUploadPolicyResponseBody body;

    public static GetUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadPolicyResponse self = new GetUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadPolicyResponse setBody(GetUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
