// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateBatchPublishOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBatchPublishOrderResponseBody body;

    public static CreateBatchPublishOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchPublishOrderResponse self = new CreateBatchPublishOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateBatchPublishOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBatchPublishOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBatchPublishOrderResponse setBody(CreateBatchPublishOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBatchPublishOrderResponseBody getBody() {
        return this.body;
    }

}
