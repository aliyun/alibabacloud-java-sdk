// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNASDefaultMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNASDefaultMountTargetResponseBody body;

    public static ModifyNASDefaultMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNASDefaultMountTargetResponse self = new ModifyNASDefaultMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNASDefaultMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNASDefaultMountTargetResponse setBody(ModifyNASDefaultMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNASDefaultMountTargetResponseBody getBody() {
        return this.body;
    }

}
