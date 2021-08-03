// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetNASDefaultMountTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetNASDefaultMountTargetResponseBody body;

    public static ResetNASDefaultMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetNASDefaultMountTargetResponse self = new ResetNASDefaultMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public ResetNASDefaultMountTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetNASDefaultMountTargetResponse setBody(ResetNASDefaultMountTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetNASDefaultMountTargetResponseBody getBody() {
        return this.body;
    }

}
