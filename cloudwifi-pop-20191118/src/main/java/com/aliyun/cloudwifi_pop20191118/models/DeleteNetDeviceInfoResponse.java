// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteNetDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetDeviceInfoResponseBody body;

    public static DeleteNetDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetDeviceInfoResponse self = new DeleteNetDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetDeviceInfoResponse setBody(DeleteNetDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
