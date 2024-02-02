// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyQueueEventLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLegacyQueueEventLogsResponseBody body;

    public static ListLegacyQueueEventLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLegacyQueueEventLogsResponse self = new ListLegacyQueueEventLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListLegacyQueueEventLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLegacyQueueEventLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLegacyQueueEventLogsResponse setBody(ListLegacyQueueEventLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLegacyQueueEventLogsResponseBody getBody() {
        return this.body;
    }

}
