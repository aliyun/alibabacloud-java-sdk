// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class EditTaskPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditTaskPopResponseBody body;

    public static EditTaskPopResponse build(java.util.Map<String, ?> map) throws Exception {
        EditTaskPopResponse self = new EditTaskPopResponse();
        return TeaModel.build(map, self);
    }

    public EditTaskPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditTaskPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditTaskPopResponse setBody(EditTaskPopResponseBody body) {
        this.body = body;
        return this;
    }
    public EditTaskPopResponseBody getBody() {
        return this.body;
    }

}
