// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetShopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetShopResponseBody body;

    public static GetShopResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShopResponse self = new GetShopResponse();
        return TeaModel.build(map, self);
    }

    public GetShopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShopResponse setBody(GetShopResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShopResponseBody getBody() {
        return this.body;
    }

}
