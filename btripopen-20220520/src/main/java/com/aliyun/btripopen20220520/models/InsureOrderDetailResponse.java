// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsureOrderDetailResponseBody body;

    public static InsureOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderDetailResponse self = new InsureOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public InsureOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsureOrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsureOrderDetailResponse setBody(InsureOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public InsureOrderDetailResponseBody getBody() {
        return this.body;
    }

}
