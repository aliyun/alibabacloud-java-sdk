// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataArchiveOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataArchiveOrderResponseBody body;

    public static CreateDataArchiveOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataArchiveOrderResponse self = new CreateDataArchiveOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataArchiveOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataArchiveOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataArchiveOrderResponse setBody(CreateDataArchiveOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataArchiveOrderResponseBody getBody() {
        return this.body;
    }

}
