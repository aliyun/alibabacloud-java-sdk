// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMessageGroupResponseBody body;

    public static UpdateMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageGroupResponse self = new UpdateMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMessageGroupResponse setBody(UpdateMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMessageGroupResponseBody getBody() {
        return this.body;
    }

}
