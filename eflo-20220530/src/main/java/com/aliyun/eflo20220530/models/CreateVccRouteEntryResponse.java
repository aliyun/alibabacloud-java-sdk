// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVccRouteEntryResponseBody body;

    public static CreateVccRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVccRouteEntryResponse self = new CreateVccRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateVccRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVccRouteEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVccRouteEntryResponse setBody(CreateVccRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVccRouteEntryResponseBody getBody() {
        return this.body;
    }

}
