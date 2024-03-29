// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditZeroCreditShutdownResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditZeroCreditShutdownResponseBody body;

    public static EditZeroCreditShutdownResponse build(java.util.Map<String, ?> map) throws Exception {
        EditZeroCreditShutdownResponse self = new EditZeroCreditShutdownResponse();
        return TeaModel.build(map, self);
    }

    public EditZeroCreditShutdownResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditZeroCreditShutdownResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditZeroCreditShutdownResponse setBody(EditZeroCreditShutdownResponseBody body) {
        this.body = body;
        return this;
    }
    public EditZeroCreditShutdownResponseBody getBody() {
        return this.body;
    }

}
