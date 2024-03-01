// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddInstanceMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddInstanceMembersResponseBody body;

    public static AddInstanceMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceMembersResponse self = new AddInstanceMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddInstanceMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddInstanceMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddInstanceMembersResponse setBody(AddInstanceMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddInstanceMembersResponseBody getBody() {
        return this.body;
    }

}
