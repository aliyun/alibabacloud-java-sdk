// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetDebugAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDebugAppInstanceResponseBody body;

    public static GetDebugAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDebugAppInstanceResponse self = new GetDebugAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetDebugAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDebugAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDebugAppInstanceResponse setBody(GetDebugAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDebugAppInstanceResponseBody getBody() {
        return this.body;
    }

}
