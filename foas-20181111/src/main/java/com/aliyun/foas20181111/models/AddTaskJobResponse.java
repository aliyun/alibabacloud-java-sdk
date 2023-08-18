// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class AddTaskJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTaskJobResponseBody body;

    public static AddTaskJobResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTaskJobResponse self = new AddTaskJobResponse();
        return TeaModel.build(map, self);
    }

    public AddTaskJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTaskJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTaskJobResponse setBody(AddTaskJobResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTaskJobResponseBody getBody() {
        return this.body;
    }

}
