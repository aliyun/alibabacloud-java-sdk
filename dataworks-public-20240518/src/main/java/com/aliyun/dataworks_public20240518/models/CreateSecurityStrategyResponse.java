// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSecurityStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecurityStrategyResponseBody body;

    public static CreateSecurityStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityStrategyResponse self = new CreateSecurityStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityStrategyResponse setBody(CreateSecurityStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityStrategyResponseBody getBody() {
        return this.body;
    }

}
