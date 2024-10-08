// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateUserDeliveryTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserDeliveryTaskStatusResponseBody body;

    public static UpdateUserDeliveryTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDeliveryTaskStatusResponse self = new UpdateUserDeliveryTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserDeliveryTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserDeliveryTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserDeliveryTaskStatusResponse setBody(UpdateUserDeliveryTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserDeliveryTaskStatusResponseBody getBody() {
        return this.body;
    }

}
