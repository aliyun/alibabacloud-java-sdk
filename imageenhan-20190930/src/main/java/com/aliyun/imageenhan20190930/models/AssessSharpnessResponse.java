// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessSharpnessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AssessSharpnessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssessSharpnessResponse setBody(AssessSharpnessResponseBody body) {
        this.body = body;
        return this;
    }
    public AssessSharpnessResponseBody getBody() {
        return this.body;
    }

}
