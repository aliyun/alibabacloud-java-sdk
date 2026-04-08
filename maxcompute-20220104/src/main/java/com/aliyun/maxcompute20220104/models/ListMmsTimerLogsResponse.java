// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTimerLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMmsTimerLogsResponseBody body;

    public static ListMmsTimerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTimerLogsResponse self = new ListMmsTimerLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListMmsTimerLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMmsTimerLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMmsTimerLogsResponse setBody(ListMmsTimerLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMmsTimerLogsResponseBody getBody() {
        return this.body;
    }

}
