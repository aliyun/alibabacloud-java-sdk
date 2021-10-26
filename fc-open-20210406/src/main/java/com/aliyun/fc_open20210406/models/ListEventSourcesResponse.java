// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListEventSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEventSourcesResponseBody body;

    public static ListEventSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventSourcesResponse self = new ListEventSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListEventSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventSourcesResponse setBody(ListEventSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventSourcesResponseBody getBody() {
        return this.body;
    }

}
