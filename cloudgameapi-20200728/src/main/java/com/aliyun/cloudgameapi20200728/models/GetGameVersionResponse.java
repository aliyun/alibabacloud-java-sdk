// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGameVersionResponseBody body;

    public static GetGameVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameVersionResponse self = new GetGameVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetGameVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGameVersionResponse setBody(GetGameVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGameVersionResponseBody getBody() {
        return this.body;
    }

}
