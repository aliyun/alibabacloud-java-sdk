// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUserDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserDeliveryTaskResponseBody body;

    public static CreateUserDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserDeliveryTaskResponse self = new CreateUserDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserDeliveryTaskResponse setBody(CreateUserDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
