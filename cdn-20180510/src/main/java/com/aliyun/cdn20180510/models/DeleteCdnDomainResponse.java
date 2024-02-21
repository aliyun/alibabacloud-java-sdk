// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteCdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCdnDomainResponse setBody(DeleteCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCdnDomainResponseBody getBody() {
        return this.body;
    }

}
