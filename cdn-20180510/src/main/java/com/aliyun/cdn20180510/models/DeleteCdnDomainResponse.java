// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCdnDomainResponseBody body;

    public static DeleteCdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdnDomainResponse self = new DeleteCdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCdnDomainResponse setBody(DeleteCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCdnDomainResponseBody getBody() {
        return this.body;
    }

}
