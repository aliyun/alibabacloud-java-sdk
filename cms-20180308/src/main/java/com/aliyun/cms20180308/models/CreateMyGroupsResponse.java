// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class CreateMyGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMyGroupsResponseBody body;

    public static CreateMyGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMyGroupsResponse self = new CreateMyGroupsResponse();
        return TeaModel.build(map, self);
    }

    public CreateMyGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMyGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMyGroupsResponse setBody(CreateMyGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMyGroupsResponseBody getBody() {
        return this.body;
    }

}
