// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetCatalogSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetCatalogSettingsResponse setBody(GetCatalogSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCatalogSettingsResponseBody getBody() {
        return this.body;
    }

}
