// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDcdnSubTaskResponseBody body;

    public static CreateDcdnSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnSubTaskResponse self = new CreateDcdnSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDcdnSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDcdnSubTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDcdnSubTaskResponse setBody(CreateDcdnSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDcdnSubTaskResponseBody getBody() {
        return this.body;
    }

}
