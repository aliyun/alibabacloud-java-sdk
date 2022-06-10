// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrderV2ResponseBody body;

    public static CreateOrderV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderV2Response self = new CreateOrderV2Response();
        return TeaModel.build(map, self);
    }

    public CreateOrderV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrderV2Response setBody(CreateOrderV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderV2ResponseBody getBody() {
        return this.body;
    }

}
