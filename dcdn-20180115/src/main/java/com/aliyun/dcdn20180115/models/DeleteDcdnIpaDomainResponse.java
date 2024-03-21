// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnIpaDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnIpaDomainResponseBody body;

    public static DeleteDcdnIpaDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnIpaDomainResponse self = new DeleteDcdnIpaDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnIpaDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnIpaDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnIpaDomainResponse setBody(DeleteDcdnIpaDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnIpaDomainResponseBody getBody() {
        return this.body;
    }

}
