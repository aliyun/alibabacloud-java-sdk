// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderUrlDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsureOrderUrlDetailResponseBody body;

    public static InsureOrderUrlDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderUrlDetailResponse self = new InsureOrderUrlDetailResponse();
        return TeaModel.build(map, self);
    }

    public InsureOrderUrlDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsureOrderUrlDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsureOrderUrlDetailResponse setBody(InsureOrderUrlDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public InsureOrderUrlDetailResponseBody getBody() {
        return this.body;
    }

}
