// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListSupportedConnectorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupportedConnectorsResponseBody body;

    public static ListSupportedConnectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupportedConnectorsResponse self = new ListSupportedConnectorsResponse();
        return TeaModel.build(map, self);
    }

    public ListSupportedConnectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupportedConnectorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupportedConnectorsResponse setBody(ListSupportedConnectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupportedConnectorsResponseBody getBody() {
        return this.body;
    }

}
