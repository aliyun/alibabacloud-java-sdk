// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateUserDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserDeliveryTaskResponseBody body;

    public static UpdateUserDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDeliveryTaskResponse self = new UpdateUserDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserDeliveryTaskResponse setBody(UpdateUserDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
