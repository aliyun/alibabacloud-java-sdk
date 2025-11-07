// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyBlackListStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBlackListStrategyResponseBody body;

    public static ModifyBlackListStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlackListStrategyResponse self = new ModifyBlackListStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBlackListStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBlackListStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBlackListStrategyResponse setBody(ModifyBlackListStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBlackListStrategyResponseBody getBody() {
        return this.body;
    }

}
