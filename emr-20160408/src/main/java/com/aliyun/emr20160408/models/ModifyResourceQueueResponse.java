// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyResourceQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyResourceQueueResponseBody body;

    public static ModifyResourceQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceQueueResponse self = new ModifyResourceQueueResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourceQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourceQueueResponse setBody(ModifyResourceQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourceQueueResponseBody getBody() {
        return this.body;
    }

}
