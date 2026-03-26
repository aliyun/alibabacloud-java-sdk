// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DisableInsightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableInsightResponseBody body;

    public static DisableInsightResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableInsightResponse self = new DisableInsightResponse();
        return TeaModel.build(map, self);
    }

    public DisableInsightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableInsightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableInsightResponse setBody(DisableInsightResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableInsightResponseBody getBody() {
        return this.body;
    }

}
