// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GetThingPropertySnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetThingPropertySnapshotResponseBody body;

    public static GetThingPropertySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingPropertySnapshotResponse self = new GetThingPropertySnapshotResponse();
        return TeaModel.build(map, self);
    }

    public GetThingPropertySnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThingPropertySnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetThingPropertySnapshotResponse setBody(GetThingPropertySnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThingPropertySnapshotResponseBody getBody() {
        return this.body;
    }

}
