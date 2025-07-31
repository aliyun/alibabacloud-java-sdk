// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateTenantComputeEngineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTenantComputeEngineResponseBody body;

    public static UpdateTenantComputeEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantComputeEngineResponse self = new UpdateTenantComputeEngineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTenantComputeEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTenantComputeEngineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTenantComputeEngineResponse setBody(UpdateTenantComputeEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTenantComputeEngineResponseBody getBody() {
        return this.body;
    }

}
