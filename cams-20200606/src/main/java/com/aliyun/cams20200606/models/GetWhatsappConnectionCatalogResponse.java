// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetWhatsappConnectionCatalogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetWhatsappConnectionCatalogResponseBody body;

    public static GetWhatsappConnectionCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWhatsappConnectionCatalogResponse self = new GetWhatsappConnectionCatalogResponse();
        return TeaModel.build(map, self);
    }

    public GetWhatsappConnectionCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWhatsappConnectionCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWhatsappConnectionCatalogResponse setBody(GetWhatsappConnectionCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWhatsappConnectionCatalogResponseBody getBody() {
        return this.body;
    }

}
