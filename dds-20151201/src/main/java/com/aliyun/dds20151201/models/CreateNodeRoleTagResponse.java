// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeRoleTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNodeRoleTagResponseBody body;

    public static CreateNodeRoleTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeRoleTagResponse self = new CreateNodeRoleTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateNodeRoleTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNodeRoleTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNodeRoleTagResponse setBody(CreateNodeRoleTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNodeRoleTagResponseBody getBody() {
        return this.body;
    }

}
