// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateShopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateShopGroupResponseBody body;

    public static CreateShopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShopGroupResponse self = new CreateShopGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateShopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateShopGroupResponse setBody(CreateShopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateShopGroupResponseBody getBody() {
        return this.body;
    }

}
