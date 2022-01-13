// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateShopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateShopResponseBody body;

    public static UpdateShopResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateShopResponse self = new UpdateShopResponse();
        return TeaModel.build(map, self);
    }

    public UpdateShopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateShopResponse setBody(UpdateShopResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateShopResponseBody getBody() {
        return this.body;
    }

}
