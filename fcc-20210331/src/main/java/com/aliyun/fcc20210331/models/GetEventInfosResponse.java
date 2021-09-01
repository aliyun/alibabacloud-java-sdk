// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetEventInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEventInfosResponseBody body;

    public static GetEventInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventInfosResponse self = new GetEventInfosResponse();
        return TeaModel.build(map, self);
    }

    public GetEventInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventInfosResponse setBody(GetEventInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventInfosResponseBody getBody() {
        return this.body;
    }

}
