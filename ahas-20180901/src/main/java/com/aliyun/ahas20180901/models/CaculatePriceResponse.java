// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CaculatePriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CaculatePriceResponseBody body;

    public static CaculatePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        CaculatePriceResponse self = new CaculatePriceResponse();
        return TeaModel.build(map, self);
    }

    public CaculatePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CaculatePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CaculatePriceResponse setBody(CaculatePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public CaculatePriceResponseBody getBody() {
        return this.body;
    }

}
