// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListEdgeDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeDeviceResponseBody body;

    public static ListEdgeDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeDeviceResponse self = new ListEdgeDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeDeviceResponse setBody(ListEdgeDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeDeviceResponseBody getBody() {
        return this.body;
    }

}
