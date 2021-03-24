// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetIMConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIMConfigResponseBody body;

    public static GetIMConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIMConfigResponse self = new GetIMConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetIMConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIMConfigResponse setBody(GetIMConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIMConfigResponseBody getBody() {
        return this.body;
    }

}
