// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteChainResponseBody body;

    public static DeleteChainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChainResponse self = new DeleteChainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChainResponse setBody(DeleteChainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChainResponseBody getBody() {
        return this.body;
    }

}
