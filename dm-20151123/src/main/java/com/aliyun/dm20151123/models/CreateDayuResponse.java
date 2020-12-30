// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateDayuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDayuResponseBody body;

    public static CreateDayuResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDayuResponse self = new CreateDayuResponse();
        return TeaModel.build(map, self);
    }

    public CreateDayuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDayuResponse setBody(CreateDayuResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDayuResponseBody getBody() {
        return this.body;
    }

}
