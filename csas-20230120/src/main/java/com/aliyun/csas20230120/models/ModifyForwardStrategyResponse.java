// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ModifyForwardStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyForwardStrategyResponseBody body;

    public static ModifyForwardStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardStrategyResponse self = new ModifyForwardStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyForwardStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyForwardStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyForwardStrategyResponse setBody(ModifyForwardStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyForwardStrategyResponseBody getBody() {
        return this.body;
    }

}
