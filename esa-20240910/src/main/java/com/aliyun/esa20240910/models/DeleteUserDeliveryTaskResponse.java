// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteUserDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserDeliveryTaskResponseBody body;

    public static DeleteUserDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDeliveryTaskResponse self = new DeleteUserDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserDeliveryTaskResponse setBody(DeleteUserDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
