// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class TriggerRepositoryMirrorSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerRepositoryMirrorSyncResponseBody body;

    public static TriggerRepositoryMirrorSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerRepositoryMirrorSyncResponse self = new TriggerRepositoryMirrorSyncResponse();
        return TeaModel.build(map, self);
    }

    public TriggerRepositoryMirrorSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerRepositoryMirrorSyncResponse setBody(TriggerRepositoryMirrorSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerRepositoryMirrorSyncResponseBody getBody() {
        return this.body;
    }

}
