// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetCatalogSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCatalogSettingsResponseBody body;

    public static GetCatalogSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogSettingsResponse self = new GetCatalogSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetCatalogSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCatalogSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCatalogSettingsResponse setBody(GetCatalogSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCatalogSettingsResponseBody getBody() {
        return this.body;
    }

}
