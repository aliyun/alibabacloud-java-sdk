// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class EditSkusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EditSkusResponseBody body;

    public static EditSkusResponse build(java.util.Map<String, ?> map) throws Exception {
        EditSkusResponse self = new EditSkusResponse();
        return TeaModel.build(map, self);
    }

    public EditSkusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditSkusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditSkusResponse setBody(EditSkusResponseBody body) {
        this.body = body;
        return this;
    }
    public EditSkusResponseBody getBody() {
        return this.body;
    }

}
