// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DoInsightsActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DoInsightsActionResponseBody body;

    public static DoInsightsActionResponse build(java.util.Map<String, ?> map) throws Exception {
        DoInsightsActionResponse self = new DoInsightsActionResponse();
        return TeaModel.build(map, self);
    }

    public DoInsightsActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoInsightsActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DoInsightsActionResponse setBody(DoInsightsActionResponseBody body) {
        this.body = body;
        return this;
    }
    public DoInsightsActionResponseBody getBody() {
        return this.body;
    }

}
