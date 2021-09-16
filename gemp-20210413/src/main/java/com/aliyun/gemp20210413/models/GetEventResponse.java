// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEventResponseBody body;

    public static GetEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventResponse self = new GetEventResponse();
        return TeaModel.build(map, self);
    }

    public GetEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventResponse setBody(GetEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventResponseBody getBody() {
        return this.body;
    }

}
