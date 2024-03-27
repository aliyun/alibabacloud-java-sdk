// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateStructSyncOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStructSyncOrderResponseBody body;

    public static CreateStructSyncOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStructSyncOrderResponse self = new CreateStructSyncOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateStructSyncOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStructSyncOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStructSyncOrderResponse setBody(CreateStructSyncOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStructSyncOrderResponseBody getBody() {
        return this.body;
    }

}
