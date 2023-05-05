// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateTenantAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTenantAppResponseBody body;

    public static UpdateTenantAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantAppResponse self = new UpdateTenantAppResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTenantAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTenantAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTenantAppResponse setBody(UpdateTenantAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTenantAppResponseBody getBody() {
        return this.body;
    }

}
