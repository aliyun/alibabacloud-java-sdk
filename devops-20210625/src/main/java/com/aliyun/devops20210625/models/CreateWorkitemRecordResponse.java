// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWorkitemRecordResponseBody body;

    public static CreateWorkitemRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemRecordResponse self = new CreateWorkitemRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkitemRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkitemRecordResponse setBody(CreateWorkitemRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkitemRecordResponseBody getBody() {
        return this.body;
    }

}
