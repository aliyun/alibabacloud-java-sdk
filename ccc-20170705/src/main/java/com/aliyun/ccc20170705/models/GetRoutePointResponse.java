// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetRoutePointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRoutePointResponseBody body;

    public static GetRoutePointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutePointResponse self = new GetRoutePointResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutePointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutePointResponse setBody(GetRoutePointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutePointResponseBody getBody() {
        return this.body;
    }

}
