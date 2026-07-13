// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListAtiChangeLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAtiChangeLogsResponseBody body;

    public static ListAtiChangeLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAtiChangeLogsResponse self = new ListAtiChangeLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListAtiChangeLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAtiChangeLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAtiChangeLogsResponse setBody(ListAtiChangeLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAtiChangeLogsResponseBody getBody() {
        return this.body;
    }

}
