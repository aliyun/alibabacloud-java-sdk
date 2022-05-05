// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListInsightsEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInsightsEventsResponseBody body;

    public static ListInsightsEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInsightsEventsResponse self = new ListInsightsEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListInsightsEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInsightsEventsResponse setBody(ListInsightsEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInsightsEventsResponseBody getBody() {
        return this.body;
    }

}
