// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class LookupInsightEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LookupInsightEventsResponseBody body;

    public static LookupInsightEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        LookupInsightEventsResponse self = new LookupInsightEventsResponse();
        return TeaModel.build(map, self);
    }

    public LookupInsightEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LookupInsightEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LookupInsightEventsResponse setBody(LookupInsightEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public LookupInsightEventsResponseBody getBody() {
        return this.body;
    }

}
