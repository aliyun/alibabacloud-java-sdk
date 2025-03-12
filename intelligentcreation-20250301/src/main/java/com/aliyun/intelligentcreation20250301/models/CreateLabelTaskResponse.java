// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class CreateLabelTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLabelTaskResponseBody body;

    public static CreateLabelTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelTaskResponse self = new CreateLabelTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLabelTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLabelTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLabelTaskResponse setBody(CreateLabelTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLabelTaskResponseBody getBody() {
        return this.body;
    }

}
