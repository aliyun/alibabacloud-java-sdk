// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EditWasmConfResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditWasmConfResponseBody body;

    public static EditWasmConfResponse build(java.util.Map<String, ?> map) throws Exception {
        EditWasmConfResponse self = new EditWasmConfResponse();
        return TeaModel.build(map, self);
    }

    public EditWasmConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditWasmConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditWasmConfResponse setBody(EditWasmConfResponseBody body) {
        this.body = body;
        return this;
    }
    public EditWasmConfResponseBody getBody() {
        return this.body;
    }

}
