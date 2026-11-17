// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateModelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelGroupResponseBody body;

    public static UpdateModelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelGroupResponse self = new UpdateModelGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelGroupResponse setBody(UpdateModelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelGroupResponseBody getBody() {
        return this.body;
    }

}
