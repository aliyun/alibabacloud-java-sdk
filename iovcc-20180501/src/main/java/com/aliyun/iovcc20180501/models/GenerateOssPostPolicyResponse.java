// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateOssPostPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateOssPostPolicyResponseBody body;

    public static GenerateOssPostPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateOssPostPolicyResponse self = new GenerateOssPostPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateOssPostPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateOssPostPolicyResponse setBody(GenerateOssPostPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateOssPostPolicyResponseBody getBody() {
        return this.body;
    }

}
