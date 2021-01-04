// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpgradeFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeFileSystemResponseBody body;

    public static UpgradeFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFileSystemResponse self = new UpgradeFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeFileSystemResponse setBody(UpgradeFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeFileSystemResponseBody getBody() {
        return this.body;
    }

}
