// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeliveryTaskResponseBody body;

    public static CreateDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryTaskResponse self = new CreateDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeliveryTaskResponse setBody(CreateDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
