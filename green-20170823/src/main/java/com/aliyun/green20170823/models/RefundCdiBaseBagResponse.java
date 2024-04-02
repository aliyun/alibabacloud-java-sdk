// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RefundCdiBaseBagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundCdiBaseBagResponseBody body;

    public static RefundCdiBaseBagResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundCdiBaseBagResponse self = new RefundCdiBaseBagResponse();
        return TeaModel.build(map, self);
    }

    public RefundCdiBaseBagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundCdiBaseBagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundCdiBaseBagResponse setBody(RefundCdiBaseBagResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundCdiBaseBagResponseBody getBody() {
        return this.body;
    }

}
