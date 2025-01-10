// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpdRouteEntryResponseBody body;

    public static GetVpdRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpdRouteEntryResponse self = new GetVpdRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public GetVpdRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpdRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpdRouteEntryResponse setBody(GetVpdRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpdRouteEntryResponseBody getBody() {
        return this.body;
    }

}
