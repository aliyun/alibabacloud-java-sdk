// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserDeliveryTaskResponseBody body;

    public static GetUserDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserDeliveryTaskResponse self = new GetUserDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetUserDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserDeliveryTaskResponse setBody(GetUserDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
