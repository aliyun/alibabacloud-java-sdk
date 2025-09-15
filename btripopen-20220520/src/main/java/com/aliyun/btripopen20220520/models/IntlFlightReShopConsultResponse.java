// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopConsultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightReShopConsultResponseBody body;

    public static IntlFlightReShopConsultResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopConsultResponse self = new IntlFlightReShopConsultResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopConsultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightReShopConsultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightReShopConsultResponse setBody(IntlFlightReShopConsultResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightReShopConsultResponseBody getBody() {
        return this.body;
    }

}
