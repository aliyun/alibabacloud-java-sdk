// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetExecuteStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExecuteStateResponseBody body;

    public static GetExecuteStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExecuteStateResponse self = new GetExecuteStateResponse();
        return TeaModel.build(map, self);
    }

    public GetExecuteStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExecuteStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExecuteStateResponse setBody(GetExecuteStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExecuteStateResponseBody getBody() {
        return this.body;
    }

}
