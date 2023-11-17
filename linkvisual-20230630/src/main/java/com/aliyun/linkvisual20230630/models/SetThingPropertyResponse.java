// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class SetThingPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetThingPropertyResponseBody body;

    public static SetThingPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetThingPropertyResponse self = new SetThingPropertyResponse();
        return TeaModel.build(map, self);
    }

    public SetThingPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetThingPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetThingPropertyResponse setBody(SetThingPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetThingPropertyResponseBody getBody() {
        return this.body;
    }

}
