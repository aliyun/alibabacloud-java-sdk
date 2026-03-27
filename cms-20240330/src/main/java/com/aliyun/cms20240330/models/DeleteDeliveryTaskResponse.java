// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeliveryTaskResponseBody body;

    public static DeleteDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeliveryTaskResponse self = new DeleteDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeliveryTaskResponse setBody(DeleteDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
