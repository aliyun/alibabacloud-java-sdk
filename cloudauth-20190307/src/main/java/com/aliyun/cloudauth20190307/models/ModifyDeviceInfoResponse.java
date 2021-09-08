// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDeviceInfoResponseBody body;

    public static ModifyDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceInfoResponse self = new ModifyDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDeviceInfoResponse setBody(ModifyDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
