// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOfficeConversionTaskResponseBody body;

    public static CreateOfficeConversionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeConversionTaskResponse self = new CreateOfficeConversionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateOfficeConversionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOfficeConversionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOfficeConversionTaskResponse setBody(CreateOfficeConversionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOfficeConversionTaskResponseBody getBody() {
        return this.body;
    }

}
