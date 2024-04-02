// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RenewWebSiteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewWebSiteInstanceResponseBody body;

    public static RenewWebSiteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewWebSiteInstanceResponse self = new RenewWebSiteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewWebSiteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewWebSiteInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewWebSiteInstanceResponse setBody(RenewWebSiteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewWebSiteInstanceResponseBody getBody() {
        return this.body;
    }

}
