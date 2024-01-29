// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendLiveSnapshotJobCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendLiveSnapshotJobCommandResponseBody body;

    public static SendLiveSnapshotJobCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        SendLiveSnapshotJobCommandResponse self = new SendLiveSnapshotJobCommandResponse();
        return TeaModel.build(map, self);
    }

    public SendLiveSnapshotJobCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendLiveSnapshotJobCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendLiveSnapshotJobCommandResponse setBody(SendLiveSnapshotJobCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public SendLiveSnapshotJobCommandResponseBody getBody() {
        return this.body;
    }

}
