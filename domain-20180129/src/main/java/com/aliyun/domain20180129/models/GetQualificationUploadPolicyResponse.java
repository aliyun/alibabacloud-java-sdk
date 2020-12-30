// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetQualificationUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetQualificationUploadPolicyResponse setBody(GetQualificationUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualificationUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
