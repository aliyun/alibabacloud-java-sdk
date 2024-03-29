// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetInstanceListSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceListSaleResponseBody body;

    public static GetInstanceListSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListSaleResponse self = new GetInstanceListSaleResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceListSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceListSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceListSaleResponse setBody(GetInstanceListSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceListSaleResponseBody getBody() {
        return this.body;
    }

}
