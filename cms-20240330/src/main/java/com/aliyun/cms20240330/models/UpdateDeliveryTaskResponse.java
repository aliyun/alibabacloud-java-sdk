// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeliveryTaskResponseBody body;

    public static UpdateDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliveryTaskResponse self = new UpdateDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeliveryTaskResponse setBody(UpdateDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
