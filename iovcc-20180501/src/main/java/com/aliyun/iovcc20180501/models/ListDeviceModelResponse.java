// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceModelResponseBody body;

    public static ListDeviceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceModelResponse self = new ListDeviceModelResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceModelResponse setBody(ListDeviceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceModelResponseBody getBody() {
        return this.body;
    }

}
