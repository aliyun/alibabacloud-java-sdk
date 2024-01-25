// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventRootCauseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventRootCauseResponseBody body;

    public static GetEventRootCauseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventRootCauseResponse self = new GetEventRootCauseResponse();
        return TeaModel.build(map, self);
    }

    public GetEventRootCauseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventRootCauseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventRootCauseResponse setBody(GetEventRootCauseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventRootCauseResponseBody getBody() {
        return this.body;
    }

}
