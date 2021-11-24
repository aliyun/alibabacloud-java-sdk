// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceBasicInfoResponseBody body;

    public static ListDeviceBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBasicInfoResponse self = new ListDeviceBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceBasicInfoResponse setBody(ListDeviceBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceBasicInfoResponseBody getBody() {
        return this.body;
    }

}
