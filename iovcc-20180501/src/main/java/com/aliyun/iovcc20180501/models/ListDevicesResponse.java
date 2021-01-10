// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDevicesResponseBody body;

    public static ListDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesResponse self = new ListDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDevicesResponse setBody(ListDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDevicesResponseBody getBody() {
        return this.body;
    }

}
