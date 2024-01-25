// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateDeliverableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeliverableResponseBody body;

    public static UpdateDeliverableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliverableResponse self = new UpdateDeliverableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeliverableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeliverableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeliverableResponse setBody(UpdateDeliverableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeliverableResponseBody getBody() {
        return this.body;
    }

}
