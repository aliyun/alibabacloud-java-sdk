// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceCheckpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceCheckpointResponseBody body;

    public static GetInstanceCheckpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCheckpointResponse self = new GetInstanceCheckpointResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceCheckpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceCheckpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceCheckpointResponse setBody(GetInstanceCheckpointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceCheckpointResponseBody getBody() {
        return this.body;
    }

}
