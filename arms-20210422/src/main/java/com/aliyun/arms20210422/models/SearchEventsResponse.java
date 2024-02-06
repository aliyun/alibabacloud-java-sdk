// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SearchEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchEventsResponseBody body;

    public static SearchEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchEventsResponse self = new SearchEventsResponse();
        return TeaModel.build(map, self);
    }

    public SearchEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchEventsResponse setBody(SearchEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchEventsResponseBody getBody() {
        return this.body;
    }

}
