// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetStackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStackResponseBody body;

    public static GetStackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackResponse self = new GetStackResponse();
        return TeaModel.build(map, self);
    }

    public GetStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStackResponse setBody(GetStackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackResponseBody getBody() {
        return this.body;
    }

}
