// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateSecurityClassifyCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecurityClassifyCatalogResponseBody body;

    public static CreateSecurityClassifyCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityClassifyCatalogResponse self = new CreateSecurityClassifyCatalogResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityClassifyCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityClassifyCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityClassifyCatalogResponse setBody(CreateSecurityClassifyCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityClassifyCatalogResponseBody getBody() {
        return this.body;
    }

}
