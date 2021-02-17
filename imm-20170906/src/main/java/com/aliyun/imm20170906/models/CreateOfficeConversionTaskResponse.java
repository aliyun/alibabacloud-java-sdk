// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateOfficeConversionTaskResponse setBody(CreateOfficeConversionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOfficeConversionTaskResponseBody getBody() {
        return this.body;
    }

}
