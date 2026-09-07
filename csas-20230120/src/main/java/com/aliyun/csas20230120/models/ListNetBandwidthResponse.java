// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListNetBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNetBandwidthResponseBody body;

    public static ListNetBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetBandwidthResponse self = new ListNetBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ListNetBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetBandwidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNetBandwidthResponse setBody(ListNetBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetBandwidthResponseBody getBody() {
        return this.body;
    }

}
