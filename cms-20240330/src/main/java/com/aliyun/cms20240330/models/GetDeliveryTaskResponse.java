// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetDeliveryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeliveryTaskResponseBody body;

    public static GetDeliveryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryTaskResponse self = new GetDeliveryTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetDeliveryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeliveryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeliveryTaskResponse setBody(GetDeliveryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeliveryTaskResponseBody getBody() {
        return this.body;
    }

}
