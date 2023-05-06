// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditEndUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditEndUserStatusResponseBody body;

    public static EditEndUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        EditEndUserStatusResponse self = new EditEndUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public EditEndUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditEndUserStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditEndUserStatusResponse setBody(EditEndUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public EditEndUserStatusResponseBody getBody() {
        return this.body;
    }

}
