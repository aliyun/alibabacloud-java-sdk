// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetNotifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNotifyPolicyResponseBody body;

    public static GetNotifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNotifyPolicyResponse self = new GetNotifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetNotifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNotifyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNotifyPolicyResponse setBody(GetNotifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNotifyPolicyResponseBody getBody() {
        return this.body;
    }

}
