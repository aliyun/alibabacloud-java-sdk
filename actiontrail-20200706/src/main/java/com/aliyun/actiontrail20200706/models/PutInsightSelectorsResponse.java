// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class PutInsightSelectorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutInsightSelectorsResponseBody body;

    public static PutInsightSelectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        PutInsightSelectorsResponse self = new PutInsightSelectorsResponse();
        return TeaModel.build(map, self);
    }

    public PutInsightSelectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutInsightSelectorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutInsightSelectorsResponse setBody(PutInsightSelectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public PutInsightSelectorsResponseBody getBody() {
        return this.body;
    }

}
