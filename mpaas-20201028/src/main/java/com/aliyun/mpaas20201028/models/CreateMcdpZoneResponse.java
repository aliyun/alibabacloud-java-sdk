// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcdpZoneResponseBody body;

    public static CreateMcdpZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcdpZoneResponse self = new CreateMcdpZoneResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcdpZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcdpZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcdpZoneResponse setBody(CreateMcdpZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcdpZoneResponseBody getBody() {
        return this.body;
    }

}
