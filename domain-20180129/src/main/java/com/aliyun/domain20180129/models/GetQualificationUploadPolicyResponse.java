// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetQualificationUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualificationUploadPolicyResponseBody body;

    public static GetQualificationUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualificationUploadPolicyResponse self = new GetQualificationUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetQualificationUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualificationUploadPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualificationUploadPolicyResponse setBody(GetQualificationUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualificationUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
