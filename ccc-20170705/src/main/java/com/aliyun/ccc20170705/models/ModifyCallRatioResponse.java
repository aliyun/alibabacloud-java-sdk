// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyCallRatioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCallRatioResponseBody body;

    public static ModifyCallRatioResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCallRatioResponse self = new ModifyCallRatioResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCallRatioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCallRatioResponse setBody(ModifyCallRatioResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCallRatioResponseBody getBody() {
        return this.body;
    }

}
