// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListConnectLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConnectLogsResponseBody body;

    public static ListConnectLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectLogsResponse self = new ListConnectLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnectLogsResponse setBody(ListConnectLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnectLogsResponseBody getBody() {
        return this.body;
    }

}
