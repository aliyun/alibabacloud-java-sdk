// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DisplayInstanceUserSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisplayInstanceUserSaleResponseBody body;

    public static DisplayInstanceUserSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisplayInstanceUserSaleResponse self = new DisplayInstanceUserSaleResponse();
        return TeaModel.build(map, self);
    }

    public DisplayInstanceUserSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisplayInstanceUserSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisplayInstanceUserSaleResponse setBody(DisplayInstanceUserSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisplayInstanceUserSaleResponseBody getBody() {
        return this.body;
    }

}
