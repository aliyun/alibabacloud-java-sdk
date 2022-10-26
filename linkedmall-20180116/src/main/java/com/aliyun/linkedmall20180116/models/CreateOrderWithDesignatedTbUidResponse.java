// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrderWithDesignatedTbUidResponseBody body;

    public static CreateOrderWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderWithDesignatedTbUidResponse self = new CreateOrderWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrderWithDesignatedTbUidResponse setBody(CreateOrderWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
