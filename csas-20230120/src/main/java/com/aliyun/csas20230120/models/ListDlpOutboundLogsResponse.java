// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDlpOutboundLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDlpOutboundLogsResponseBody body;

    public static ListDlpOutboundLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDlpOutboundLogsResponse self = new ListDlpOutboundLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListDlpOutboundLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDlpOutboundLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDlpOutboundLogsResponse setBody(ListDlpOutboundLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDlpOutboundLogsResponseBody getBody() {
        return this.body;
    }

}
