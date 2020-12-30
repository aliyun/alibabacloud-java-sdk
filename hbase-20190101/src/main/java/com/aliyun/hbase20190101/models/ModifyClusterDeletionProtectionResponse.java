// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyClusterDeletionProtectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterDeletionProtectionResponseBody body;

    public static ModifyClusterDeletionProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDeletionProtectionResponse self = new ModifyClusterDeletionProtectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDeletionProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterDeletionProtectionResponse setBody(ModifyClusterDeletionProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterDeletionProtectionResponseBody getBody() {
        return this.body;
    }

}
