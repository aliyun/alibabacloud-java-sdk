// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAckNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAckNamespacesResponseBody body;

    public static ListAckNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAckNamespacesResponse self = new ListAckNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public ListAckNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAckNamespacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAckNamespacesResponse setBody(ListAckNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAckNamespacesResponseBody getBody() {
        return this.body;
    }

}
