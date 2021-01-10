// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceTypesResponseBody body;

    public static ListDeviceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceTypesResponse self = new ListDeviceTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceTypesResponse setBody(ListDeviceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceTypesResponseBody getBody() {
        return this.body;
    }

}
