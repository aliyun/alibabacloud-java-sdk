// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class CreateHybridDoubleWriteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHybridDoubleWriteResponseBody body;

    public static CreateHybridDoubleWriteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridDoubleWriteResponse self = new CreateHybridDoubleWriteResponse();
        return TeaModel.build(map, self);
    }

    public CreateHybridDoubleWriteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHybridDoubleWriteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHybridDoubleWriteResponse setBody(CreateHybridDoubleWriteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHybridDoubleWriteResponseBody getBody() {
        return this.body;
    }

}
