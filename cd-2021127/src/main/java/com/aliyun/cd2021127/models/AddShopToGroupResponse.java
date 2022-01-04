// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddShopToGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddShopToGroupResponseBody body;

    public static AddShopToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddShopToGroupResponse self = new AddShopToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddShopToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddShopToGroupResponse setBody(AddShopToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddShopToGroupResponseBody getBody() {
        return this.body;
    }

}
