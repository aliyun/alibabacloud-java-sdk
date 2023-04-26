// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetErRouteEntryResponseBody body;

    public static GetErRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetErRouteEntryResponse self = new GetErRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public GetErRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetErRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetErRouteEntryResponse setBody(GetErRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetErRouteEntryResponseBody getBody() {
        return this.body;
    }

}
