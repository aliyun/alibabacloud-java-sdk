// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnWafPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnWafPolicyResponseBody body;

    public static DeleteDcdnWafPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnWafPolicyResponse self = new DeleteDcdnWafPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnWafPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnWafPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnWafPolicyResponse setBody(DeleteDcdnWafPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnWafPolicyResponseBody getBody() {
        return this.body;
    }

}
