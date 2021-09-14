// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScreenConfigResponseBody body;

    public static GetScreenConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScreenConfigResponse self = new GetScreenConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetScreenConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScreenConfigResponse setBody(GetScreenConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScreenConfigResponseBody getBody() {
        return this.body;
    }

}
