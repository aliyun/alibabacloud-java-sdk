// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class SetGroupDeletionProtectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetGroupDeletionProtectionResponseBody body;

    public static SetGroupDeletionProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGroupDeletionProtectionResponse self = new SetGroupDeletionProtectionResponse();
        return TeaModel.build(map, self);
    }

    public SetGroupDeletionProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGroupDeletionProtectionResponse setBody(SetGroupDeletionProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGroupDeletionProtectionResponseBody getBody() {
        return this.body;
    }

}
