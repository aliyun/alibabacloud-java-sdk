// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class TriggerRepositoryMirrorSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public TriggerRepositoryMirrorSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerRepositoryMirrorSyncResponse setBody(TriggerRepositoryMirrorSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerRepositoryMirrorSyncResponseBody getBody() {
        return this.body;
    }

}
