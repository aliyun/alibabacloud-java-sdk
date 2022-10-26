// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOutDiscountOrderWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOutDiscountOrderWithDesignatedTbUidResponseBody body;

    public static CreateOutDiscountOrderWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOutDiscountOrderWithDesignatedTbUidResponse self = new CreateOutDiscountOrderWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public CreateOutDiscountOrderWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOutDiscountOrderWithDesignatedTbUidResponse setBody(CreateOutDiscountOrderWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOutDiscountOrderWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
