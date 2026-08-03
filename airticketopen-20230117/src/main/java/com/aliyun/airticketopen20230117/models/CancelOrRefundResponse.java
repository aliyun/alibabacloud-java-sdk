// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CancelOrRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelOrRefundResponseBody body;

    public static CancelOrRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOrRefundResponse self = new CancelOrRefundResponse();
        return TeaModel.build(map, self);
    }

    public CancelOrRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOrRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOrRefundResponse setBody(CancelOrRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOrRefundResponseBody getBody() {
        return this.body;
    }

}
