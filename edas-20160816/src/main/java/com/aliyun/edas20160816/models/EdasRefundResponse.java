// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20160816.models;

import com.aliyun.tea.*;

public class EdasRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EdasRefundResponseBody body;

    public static EdasRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        EdasRefundResponse self = new EdasRefundResponse();
        return TeaModel.build(map, self);
    }

    public EdasRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EdasRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EdasRefundResponse setBody(EdasRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public EdasRefundResponseBody getBody() {
        return this.body;
    }

}
