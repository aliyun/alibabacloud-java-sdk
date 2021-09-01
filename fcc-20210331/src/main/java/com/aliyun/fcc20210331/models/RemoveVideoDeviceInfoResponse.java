// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RemoveVideoDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveVideoDeviceInfoResponseBody body;

    public static RemoveVideoDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVideoDeviceInfoResponse self = new RemoveVideoDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVideoDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveVideoDeviceInfoResponse setBody(RemoveVideoDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVideoDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
