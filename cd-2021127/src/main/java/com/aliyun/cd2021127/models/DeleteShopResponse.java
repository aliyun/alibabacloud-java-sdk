// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteShopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteShopResponseBody body;

    public static DeleteShopResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteShopResponse self = new DeleteShopResponse();
        return TeaModel.build(map, self);
    }

    public DeleteShopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteShopResponse setBody(DeleteShopResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteShopResponseBody getBody() {
        return this.body;
    }

}
