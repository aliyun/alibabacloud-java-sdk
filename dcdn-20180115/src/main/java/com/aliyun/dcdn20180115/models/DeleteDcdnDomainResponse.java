// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDcdnDomainResponseBody body;

    public static DeleteDcdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnDomainResponse self = new DeleteDcdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnDomainResponse setBody(DeleteDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnDomainResponseBody getBody() {
        return this.body;
    }

}
