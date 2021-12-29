// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceResponseBody body;

    public static ListDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceResponse self = new ListDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceResponse setBody(ListDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceResponseBody getBody() {
        return this.body;
    }

}
