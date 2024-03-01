// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteInstanceMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstanceMembersResponseBody body;

    public static DeleteInstanceMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceMembersResponse self = new DeleteInstanceMembersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceMembersResponse setBody(DeleteInstanceMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceMembersResponseBody getBody() {
        return this.body;
    }

}
