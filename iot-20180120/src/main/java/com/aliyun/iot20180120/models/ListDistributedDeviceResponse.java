// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDistributedDeviceResponseBody body;

    public static ListDistributedDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedDeviceResponse self = new ListDistributedDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributedDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistributedDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistributedDeviceResponse setBody(ListDistributedDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributedDeviceResponseBody getBody() {
        return this.body;
    }

}
