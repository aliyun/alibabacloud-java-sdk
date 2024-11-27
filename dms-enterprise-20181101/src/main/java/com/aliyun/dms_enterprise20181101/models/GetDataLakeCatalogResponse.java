// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataLakeCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataLakeCatalogResponseBody body;

    public static GetDataLakeCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataLakeCatalogResponse self = new GetDataLakeCatalogResponse();
        return TeaModel.build(map, self);
    }

    public GetDataLakeCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataLakeCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataLakeCatalogResponse setBody(GetDataLakeCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataLakeCatalogResponseBody getBody() {
        return this.body;
    }

}
