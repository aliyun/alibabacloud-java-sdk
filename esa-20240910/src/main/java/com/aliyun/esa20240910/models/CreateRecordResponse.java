// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecordResponseBody body;

    public static CreateRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordResponse self = new CreateRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecordResponse setBody(CreateRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecordResponseBody getBody() {
        return this.body;
    }

}
