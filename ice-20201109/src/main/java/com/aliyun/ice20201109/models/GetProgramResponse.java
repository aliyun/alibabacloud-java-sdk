// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetProgramResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProgramResponseBody body;

    public static GetProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProgramResponse self = new GetProgramResponse();
        return TeaModel.build(map, self);
    }

    public GetProgramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProgramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProgramResponse setBody(GetProgramResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProgramResponseBody getBody() {
        return this.body;
    }

}
