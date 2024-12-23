// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTaskLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMmsTaskLogsResponseBody body;

    public static ListMmsTaskLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTaskLogsResponse self = new ListMmsTaskLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListMmsTaskLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMmsTaskLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMmsTaskLogsResponse setBody(ListMmsTaskLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMmsTaskLogsResponseBody getBody() {
        return this.body;
    }

}
