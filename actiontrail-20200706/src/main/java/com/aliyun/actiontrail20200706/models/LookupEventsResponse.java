// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class LookupEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LookupEventsResponseBody body;

    public static LookupEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        LookupEventsResponse self = new LookupEventsResponse();
        return TeaModel.build(map, self);
    }

    public LookupEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LookupEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LookupEventsResponse setBody(LookupEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public LookupEventsResponseBody getBody() {
        return this.body;
    }

}
