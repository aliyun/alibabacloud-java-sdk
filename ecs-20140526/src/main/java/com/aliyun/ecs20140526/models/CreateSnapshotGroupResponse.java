// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSnapshotGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSnapshotGroupResponseBody body;

    public static CreateSnapshotGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotGroupResponse self = new CreateSnapshotGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSnapshotGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSnapshotGroupResponse setBody(CreateSnapshotGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSnapshotGroupResponseBody getBody() {
        return this.body;
    }

}
