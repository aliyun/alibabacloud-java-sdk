// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetCommonBuyUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCommonBuyUrlResponseBody body;

    public static GetCommonBuyUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommonBuyUrlResponse self = new GetCommonBuyUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetCommonBuyUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommonBuyUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCommonBuyUrlResponse setBody(GetCommonBuyUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommonBuyUrlResponseBody getBody() {
        return this.body;
    }

}
