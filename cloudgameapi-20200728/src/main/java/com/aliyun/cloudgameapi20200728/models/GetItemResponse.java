// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetItemResponseBody body;

    public static GetItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetItemResponse self = new GetItemResponse();
        return TeaModel.build(map, self);
    }

    public GetItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetItemResponse setBody(GetItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetItemResponseBody getBody() {
        return this.body;
    }

}
