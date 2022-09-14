// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class RenewInstanceCommodityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RenewInstanceCommodityInstanceResponseBody body;

    public static RenewInstanceCommodityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceCommodityInstanceResponse self = new RenewInstanceCommodityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewInstanceCommodityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewInstanceCommodityInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewInstanceCommodityInstanceResponse setBody(RenewInstanceCommodityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewInstanceCommodityInstanceResponseBody getBody() {
        return this.body;
    }

}
