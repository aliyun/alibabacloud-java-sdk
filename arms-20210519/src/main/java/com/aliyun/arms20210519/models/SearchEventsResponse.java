// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class SearchEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SearchEventsResponse setBody(SearchEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchEventsResponseBody getBody() {
        return this.body;
    }

}
