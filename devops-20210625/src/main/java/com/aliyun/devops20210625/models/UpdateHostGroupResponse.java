// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHostGroupResponseBody body;

    public static UpdateHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHostGroupResponse self = new UpdateHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHostGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHostGroupResponse setBody(UpdateHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHostGroupResponseBody getBody() {
        return this.body;
    }

}
