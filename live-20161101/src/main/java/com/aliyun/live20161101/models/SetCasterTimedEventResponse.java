// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterTimedEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetCasterTimedEventResponseBody body;

    public static SetCasterTimedEventResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCasterTimedEventResponse self = new SetCasterTimedEventResponse();
        return TeaModel.build(map, self);
    }

    public SetCasterTimedEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCasterTimedEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCasterTimedEventResponse setBody(SetCasterTimedEventResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCasterTimedEventResponseBody getBody() {
        return this.body;
    }

}
