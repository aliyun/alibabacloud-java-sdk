// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateDeliverableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeliverableResponseBody body;

    public static CreateDeliverableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliverableResponse self = new CreateDeliverableResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeliverableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeliverableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeliverableResponse setBody(CreateDeliverableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeliverableResponseBody getBody() {
        return this.body;
    }

}
