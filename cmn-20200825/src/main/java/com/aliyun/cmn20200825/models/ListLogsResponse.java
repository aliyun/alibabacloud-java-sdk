// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLogsResponseBody body;

    public static ListLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogsResponse self = new ListLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogsResponse setBody(ListLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogsResponseBody getBody() {
        return this.body;
    }

}
