// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnWafPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteDcdnWafPolicyResponse setBody(DeleteDcdnWafPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnWafPolicyResponseBody getBody() {
        return this.body;
    }

}
