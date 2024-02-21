// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class EnableInsightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableInsightResponseBody body;

    public static EnableInsightResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableInsightResponse self = new EnableInsightResponse();
        return TeaModel.build(map, self);
    }

    public EnableInsightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableInsightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableInsightResponse setBody(EnableInsightResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableInsightResponseBody getBody() {
        return this.body;
    }

}
