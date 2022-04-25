// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateCatalogSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateCatalogSettingsResponse setBody(UpdateCatalogSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCatalogSettingsResponseBody getBody() {
        return this.body;
    }

}
