// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StopSiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopSiteResponseBody body;

    public static StopSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSiteResponse self = new StopSiteResponse();
        return TeaModel.build(map, self);
    }

    public StopSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopSiteResponse setBody(StopSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSiteResponseBody getBody() {
        return this.body;
    }

}
