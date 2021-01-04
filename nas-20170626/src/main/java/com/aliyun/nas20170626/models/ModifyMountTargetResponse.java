// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMountTargetResponseBody body;

    public static ModifyMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMountTargetResponse self = new ModifyMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMountTargetResponse setBody(ModifyMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMountTargetResponseBody getBody() {
        return this.body;
    }

}
