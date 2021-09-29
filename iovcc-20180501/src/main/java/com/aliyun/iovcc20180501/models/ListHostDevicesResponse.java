// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListHostDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostDevicesResponseBody body;

    public static ListHostDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostDevicesResponse self = new ListHostDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListHostDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostDevicesResponse setBody(ListHostDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostDevicesResponseBody getBody() {
        return this.body;
    }

}
