// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class RemoveShopFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveShopFromGroupResponseBody body;

    public static RemoveShopFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveShopFromGroupResponse self = new RemoveShopFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveShopFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveShopFromGroupResponse setBody(RemoveShopFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveShopFromGroupResponseBody getBody() {
        return this.body;
    }

}
