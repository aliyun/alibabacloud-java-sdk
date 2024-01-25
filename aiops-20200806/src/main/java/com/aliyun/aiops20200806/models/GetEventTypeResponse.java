// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventTypeResponseBody body;

    public static GetEventTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventTypeResponse self = new GetEventTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetEventTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventTypeResponse setBody(GetEventTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventTypeResponseBody getBody() {
        return this.body;
    }

}
