// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class ClassifyCommodityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClassifyCommodityResponseBody body;

    public static ClassifyCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        ClassifyCommodityResponse self = new ClassifyCommodityResponse();
        return TeaModel.build(map, self);
    }

    public ClassifyCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClassifyCommodityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClassifyCommodityResponse setBody(ClassifyCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public ClassifyCommodityResponseBody getBody() {
        return this.body;
    }

}
