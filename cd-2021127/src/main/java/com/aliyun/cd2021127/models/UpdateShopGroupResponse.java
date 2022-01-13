// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateShopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateShopGroupResponseBody body;

    public static UpdateShopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateShopGroupResponse self = new UpdateShopGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateShopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateShopGroupResponse setBody(UpdateShopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateShopGroupResponseBody getBody() {
        return this.body;
    }

}
