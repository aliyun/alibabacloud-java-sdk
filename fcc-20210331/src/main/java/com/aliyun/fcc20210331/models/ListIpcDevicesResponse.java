// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListIpcDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIpcDevicesResponseBody body;

    public static ListIpcDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpcDevicesResponse self = new ListIpcDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListIpcDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpcDevicesResponse setBody(ListIpcDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpcDevicesResponseBody getBody() {
        return this.body;
    }

}
