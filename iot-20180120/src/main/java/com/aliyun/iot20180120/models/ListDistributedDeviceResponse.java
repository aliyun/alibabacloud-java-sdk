// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListDistributedDeviceResponse setBody(ListDistributedDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributedDeviceResponseBody getBody() {
        return this.body;
    }

}
