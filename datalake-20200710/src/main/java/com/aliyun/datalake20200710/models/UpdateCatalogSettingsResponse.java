// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateCatalogSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCatalogSettingsResponseBody body;

    public static UpdateCatalogSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCatalogSettingsResponse self = new UpdateCatalogSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCatalogSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCatalogSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCatalogSettingsResponse setBody(UpdateCatalogSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCatalogSettingsResponseBody getBody() {
        return this.body;
    }

}
