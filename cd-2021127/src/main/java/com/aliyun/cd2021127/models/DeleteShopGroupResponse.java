// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteShopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteShopGroupResponseBody body;

    public static DeleteShopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteShopGroupResponse self = new DeleteShopGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteShopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteShopGroupResponse setBody(DeleteShopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteShopGroupResponseBody getBody() {
        return this.body;
    }

}
