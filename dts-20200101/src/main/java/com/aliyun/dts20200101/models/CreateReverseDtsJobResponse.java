// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateReverseDtsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReverseDtsJobResponseBody body;

    public static CreateReverseDtsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReverseDtsJobResponse self = new CreateReverseDtsJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateReverseDtsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReverseDtsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReverseDtsJobResponse setBody(CreateReverseDtsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReverseDtsJobResponseBody getBody() {
        return this.body;
    }

}
