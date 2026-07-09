// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceCustomizedDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstanceCustomizedDomainResponseBody body;

    public static DeleteInstanceCustomizedDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceCustomizedDomainResponse self = new DeleteInstanceCustomizedDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceCustomizedDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceCustomizedDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceCustomizedDomainResponse setBody(DeleteInstanceCustomizedDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceCustomizedDomainResponseBody getBody() {
        return this.body;
    }

}
