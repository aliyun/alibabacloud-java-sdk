// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetEventHouseRuntimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventHouseRuntimeResponseBody body;

    public static GetEventHouseRuntimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventHouseRuntimeResponse self = new GetEventHouseRuntimeResponse();
        return TeaModel.build(map, self);
    }

    public GetEventHouseRuntimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventHouseRuntimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventHouseRuntimeResponse setBody(GetEventHouseRuntimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventHouseRuntimeResponseBody getBody() {
        return this.body;
    }

}
