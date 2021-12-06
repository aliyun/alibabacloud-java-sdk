// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class DeleteDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDomainResponseBody body;

    public static DeleteDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainResponse self = new DeleteDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainResponse setBody(DeleteDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainResponseBody getBody() {
        return this.body;
    }

}
