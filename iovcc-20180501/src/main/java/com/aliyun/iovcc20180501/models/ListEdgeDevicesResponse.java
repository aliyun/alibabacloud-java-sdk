// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListEdgeDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEdgeDevicesResponseBody body;

    public static ListEdgeDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeDevicesResponse self = new ListEdgeDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeDevicesResponse setBody(ListEdgeDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeDevicesResponseBody getBody() {
        return this.body;
    }

}
