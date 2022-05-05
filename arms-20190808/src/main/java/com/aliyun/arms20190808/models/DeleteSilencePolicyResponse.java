// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSilencePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteSilencePolicyResponse setBody(DeleteSilencePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSilencePolicyResponseBody getBody() {
        return this.body;
    }

}
