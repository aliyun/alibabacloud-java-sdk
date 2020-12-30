// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyStorageStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyStorageStrategyResponseBody body;

    public static ModifyStorageStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageStrategyResponse self = new ModifyStorageStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStorageStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStorageStrategyResponse setBody(ModifyStorageStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStorageStrategyResponseBody getBody() {
        return this.body;
    }

}
