// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class RestartContainerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RestartContainerGroupResponseBody body;

    public static RestartContainerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartContainerGroupResponse self = new RestartContainerGroupResponse();
        return TeaModel.build(map, self);
    }

    public RestartContainerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartContainerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartContainerGroupResponse setBody(RestartContainerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartContainerGroupResponseBody getBody() {
        return this.body;
    }

}
