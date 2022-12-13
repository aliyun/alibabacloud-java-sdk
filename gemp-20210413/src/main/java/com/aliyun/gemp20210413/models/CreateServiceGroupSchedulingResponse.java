// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceGroupSchedulingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceGroupSchedulingResponseBody body;

    public static CreateServiceGroupSchedulingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceGroupSchedulingResponse self = new CreateServiceGroupSchedulingResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceGroupSchedulingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceGroupSchedulingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceGroupSchedulingResponse setBody(CreateServiceGroupSchedulingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceGroupSchedulingResponseBody getBody() {
        return this.body;
    }

}
