// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateServiceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceRecordResponseBody body;

    public static CreateServiceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRecordResponse self = new CreateServiceRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceRecordResponse setBody(CreateServiceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceRecordResponseBody getBody() {
        return this.body;
    }

}
