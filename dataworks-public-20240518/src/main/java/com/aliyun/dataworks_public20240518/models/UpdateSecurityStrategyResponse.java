// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateSecurityStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSecurityStrategyResponseBody body;

    public static UpdateSecurityStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityStrategyResponse self = new UpdateSecurityStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecurityStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecurityStrategyResponse setBody(UpdateSecurityStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecurityStrategyResponseBody getBody() {
        return this.body;
    }

}
