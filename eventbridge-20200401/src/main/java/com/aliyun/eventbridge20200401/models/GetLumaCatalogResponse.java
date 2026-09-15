// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLumaCatalogResponseBody body;

    public static GetLumaCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLumaCatalogResponse self = new GetLumaCatalogResponse();
        return TeaModel.build(map, self);
    }

    public GetLumaCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLumaCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLumaCatalogResponse setBody(GetLumaCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLumaCatalogResponseBody getBody() {
        return this.body;
    }

}
