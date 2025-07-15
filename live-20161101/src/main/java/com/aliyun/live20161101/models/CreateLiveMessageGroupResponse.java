// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLiveMessageGroupResponseBody body;

    public static CreateLiveMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveMessageGroupResponse self = new CreateLiveMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveMessageGroupResponse setBody(CreateLiveMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveMessageGroupResponseBody getBody() {
        return this.body;
    }

}
