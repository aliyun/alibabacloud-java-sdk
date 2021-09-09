// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyElastictaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyElastictaskResponseBody body;

    public static ModifyElastictaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElastictaskResponse self = new ModifyElastictaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElastictaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyElastictaskResponse setBody(ModifyElastictaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElastictaskResponseBody getBody() {
        return this.body;
    }

}
