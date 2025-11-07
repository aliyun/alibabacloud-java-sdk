// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyControlStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyControlStrategyResponseBody body;

    public static ModifyControlStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlStrategyResponse self = new ModifyControlStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyControlStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyControlStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyControlStrategyResponse setBody(ModifyControlStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyControlStrategyResponseBody getBody() {
        return this.body;
    }

}
