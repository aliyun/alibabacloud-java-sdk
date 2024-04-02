// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RefundWebSiteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundWebSiteInstanceResponseBody body;

    public static RefundWebSiteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundWebSiteInstanceResponse self = new RefundWebSiteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RefundWebSiteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundWebSiteInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundWebSiteInstanceResponse setBody(RefundWebSiteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundWebSiteInstanceResponseBody getBody() {
        return this.body;
    }

}
