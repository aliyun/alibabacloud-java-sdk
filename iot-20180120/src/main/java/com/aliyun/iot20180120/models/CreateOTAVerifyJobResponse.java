// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAVerifyJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOTAVerifyJobResponseBody body;

    public static CreateOTAVerifyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAVerifyJobResponse self = new CreateOTAVerifyJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateOTAVerifyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOTAVerifyJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOTAVerifyJobResponse setBody(CreateOTAVerifyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOTAVerifyJobResponseBody getBody() {
        return this.body;
    }

}
