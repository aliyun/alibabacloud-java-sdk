// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountDevicesResponseBody body;

    public static CountDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        CountDevicesResponse self = new CountDevicesResponse();
        return TeaModel.build(map, self);
    }

    public CountDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountDevicesResponse setBody(CountDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public CountDevicesResponseBody getBody() {
        return this.body;
    }

}
