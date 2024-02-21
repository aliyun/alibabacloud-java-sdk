// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessKeyLastUsedEventsResponseBody body;

    public static GetAccessKeyLastUsedEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedEventsResponse self = new GetAccessKeyLastUsedEventsResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessKeyLastUsedEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessKeyLastUsedEventsResponse setBody(GetAccessKeyLastUsedEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessKeyLastUsedEventsResponseBody getBody() {
        return this.body;
    }

}
