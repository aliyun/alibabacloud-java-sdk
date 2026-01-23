// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityClassifyCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityClassifyCatalogResponseBody body;

    public static DeleteSecurityClassifyCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityClassifyCatalogResponse self = new DeleteSecurityClassifyCatalogResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityClassifyCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityClassifyCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityClassifyCatalogResponse setBody(DeleteSecurityClassifyCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityClassifyCatalogResponseBody getBody() {
        return this.body;
    }

}
