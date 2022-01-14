// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateMcdpZoneResponse setBody(CreateMcdpZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcdpZoneResponseBody getBody() {
        return this.body;
    }

}
