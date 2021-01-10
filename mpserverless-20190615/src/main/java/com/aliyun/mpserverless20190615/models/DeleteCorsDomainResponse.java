// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteCorsDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCorsDomainResponseBody body;

    public static DeleteCorsDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCorsDomainResponse self = new DeleteCorsDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCorsDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCorsDomainResponse setBody(DeleteCorsDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCorsDomainResponseBody getBody() {
        return this.body;
    }

}
