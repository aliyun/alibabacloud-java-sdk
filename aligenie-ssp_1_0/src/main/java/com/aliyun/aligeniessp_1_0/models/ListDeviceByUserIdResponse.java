// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceByUserIdResponseBody body;

    public static ListDeviceByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceByUserIdResponse self = new ListDeviceByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceByUserIdResponse setBody(ListDeviceByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceByUserIdResponseBody getBody() {
        return this.body;
    }

}
