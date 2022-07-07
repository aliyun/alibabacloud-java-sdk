// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ModifyShopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyShopResponseBody body;

    public static ModifyShopResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyShopResponse self = new ModifyShopResponse();
        return TeaModel.build(map, self);
    }

    public ModifyShopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyShopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyShopResponse setBody(ModifyShopResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyShopResponseBody getBody() {
        return this.body;
    }

}
