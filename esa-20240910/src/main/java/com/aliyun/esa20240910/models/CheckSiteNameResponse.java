// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSiteNameResponseBody body;

    public static CheckSiteNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSiteNameResponse self = new CheckSiteNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckSiteNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSiteNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSiteNameResponse setBody(CheckSiteNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSiteNameResponseBody getBody() {
        return this.body;
    }

}
