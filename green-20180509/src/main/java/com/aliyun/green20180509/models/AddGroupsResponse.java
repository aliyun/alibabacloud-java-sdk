// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGroupsResponseBody body;

    public static AddGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGroupsResponse self = new AddGroupsResponse();
        return TeaModel.build(map, self);
    }

    public AddGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGroupsResponse setBody(AddGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGroupsResponseBody getBody() {
        return this.body;
    }

}
