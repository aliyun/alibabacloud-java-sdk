// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateModuleMarketAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateModuleMarketAttributeResponseBody body;

    public static UpdateModuleMarketAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleMarketAttributeResponse self = new UpdateModuleMarketAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModuleMarketAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModuleMarketAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModuleMarketAttributeResponse setBody(UpdateModuleMarketAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModuleMarketAttributeResponseBody getBody() {
        return this.body;
    }

}
