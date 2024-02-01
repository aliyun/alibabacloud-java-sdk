// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateStreamSnapshotJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStreamSnapshotJobResponseBody body;

    public static CreateStreamSnapshotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamSnapshotJobResponse self = new CreateStreamSnapshotJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamSnapshotJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamSnapshotJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStreamSnapshotJobResponse setBody(CreateStreamSnapshotJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamSnapshotJobResponseBody getBody() {
        return this.body;
    }

}
