// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyMountPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMountPointResponseBody body;

    public static ModifyMountPointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMountPointResponse self = new ModifyMountPointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMountPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMountPointResponse setBody(ModifyMountPointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMountPointResponseBody getBody() {
        return this.body;
    }

}
