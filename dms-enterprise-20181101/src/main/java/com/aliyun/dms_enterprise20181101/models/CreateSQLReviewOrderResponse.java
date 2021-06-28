// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateSQLReviewOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSQLReviewOrderResponseBody body;

    public static CreateSQLReviewOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSQLReviewOrderResponse self = new CreateSQLReviewOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateSQLReviewOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSQLReviewOrderResponse setBody(CreateSQLReviewOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSQLReviewOrderResponseBody getBody() {
        return this.body;
    }

}
