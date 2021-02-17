// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteOfficeConversionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOfficeConversionTaskResponseBody body;

    public static DeleteOfficeConversionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfficeConversionTaskResponse self = new DeleteOfficeConversionTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOfficeConversionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOfficeConversionTaskResponse setBody(DeleteOfficeConversionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOfficeConversionTaskResponseBody getBody() {
        return this.body;
    }

}
