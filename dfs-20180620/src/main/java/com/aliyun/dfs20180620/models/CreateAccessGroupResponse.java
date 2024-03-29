// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateAccessGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccessGroupResponseBody body;

    public static CreateAccessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessGroupResponse self = new CreateAccessGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccessGroupResponse setBody(CreateAccessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessGroupResponseBody getBody() {
        return this.body;
    }

}
