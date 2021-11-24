// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceIdByIdentitysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceIdByIdentitysResponseBody body;

    public static ListDeviceIdByIdentitysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceIdByIdentitysResponse self = new ListDeviceIdByIdentitysResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceIdByIdentitysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceIdByIdentitysResponse setBody(ListDeviceIdByIdentitysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceIdByIdentitysResponseBody getBody() {
        return this.body;
    }

}
