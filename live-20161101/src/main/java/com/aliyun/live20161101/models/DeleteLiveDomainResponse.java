// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveDomainResponseBody body;

    public static DeleteLiveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainResponse self = new DeleteLiveDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveDomainResponse setBody(DeleteLiveDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveDomainResponseBody getBody() {
        return this.body;
    }

}
