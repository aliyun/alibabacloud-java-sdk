// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RefundCdiBagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundCdiBagResponseBody body;

    public static RefundCdiBagResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundCdiBagResponse self = new RefundCdiBagResponse();
        return TeaModel.build(map, self);
    }

    public RefundCdiBagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundCdiBagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundCdiBagResponse setBody(RefundCdiBagResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundCdiBagResponseBody getBody() {
        return this.body;
    }

}
