// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEventsResponseBody body;

    public static ListEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventsResponse self = new ListEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventsResponse setBody(ListEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventsResponseBody getBody() {
        return this.body;
    }

}
