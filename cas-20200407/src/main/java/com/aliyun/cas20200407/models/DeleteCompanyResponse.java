// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCompanyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCompanyResponseBody body;

    public static DeleteCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompanyResponse self = new DeleteCompanyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCompanyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCompanyResponse setBody(DeleteCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCompanyResponseBody getBody() {
        return this.body;
    }

}
