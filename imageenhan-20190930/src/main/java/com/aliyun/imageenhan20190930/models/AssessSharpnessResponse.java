// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessSharpnessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssessSharpnessResponseBody body;

    public static AssessSharpnessResponse build(java.util.Map<String, ?> map) throws Exception {
        AssessSharpnessResponse self = new AssessSharpnessResponse();
        return TeaModel.build(map, self);
    }

    public AssessSharpnessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssessSharpnessResponse setBody(AssessSharpnessResponseBody body) {
        this.body = body;
        return this;
    }
    public AssessSharpnessResponseBody getBody() {
        return this.body;
    }

}
