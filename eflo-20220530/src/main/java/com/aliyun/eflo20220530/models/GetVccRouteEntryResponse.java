// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetVccRouteEntryResponseBody body;

    public static GetVccRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVccRouteEntryResponse self = new GetVccRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public GetVccRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVccRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVccRouteEntryResponse setBody(GetVccRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVccRouteEntryResponseBody getBody() {
        return this.body;
    }

}
