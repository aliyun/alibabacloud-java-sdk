// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSilencePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSilencePolicyResponseBody body;

    public static DeleteSilencePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSilencePolicyResponse self = new DeleteSilencePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSilencePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSilencePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSilencePolicyResponse setBody(DeleteSilencePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSilencePolicyResponseBody getBody() {
        return this.body;
    }

}
