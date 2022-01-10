// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GetInstanceIdsFromTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceIdsFromTokenResponseBody body;

    public static GetInstanceIdsFromTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIdsFromTokenResponse self = new GetInstanceIdsFromTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceIdsFromTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceIdsFromTokenResponse setBody(GetInstanceIdsFromTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceIdsFromTokenResponseBody getBody() {
        return this.body;
    }

}
