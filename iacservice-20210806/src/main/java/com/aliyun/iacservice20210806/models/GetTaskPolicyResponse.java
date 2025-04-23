// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetTaskPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskPolicyResponseBody body;

    public static GetTaskPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskPolicyResponse self = new GetTaskPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskPolicyResponse setBody(GetTaskPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskPolicyResponseBody getBody() {
        return this.body;
    }

}
