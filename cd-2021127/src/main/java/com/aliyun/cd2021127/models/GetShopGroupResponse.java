// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetShopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetShopGroupResponseBody body;

    public static GetShopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShopGroupResponse self = new GetShopGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetShopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShopGroupResponse setBody(GetShopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShopGroupResponseBody getBody() {
        return this.body;
    }

}
