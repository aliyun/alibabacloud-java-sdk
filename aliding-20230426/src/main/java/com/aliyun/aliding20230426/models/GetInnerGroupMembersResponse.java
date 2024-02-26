// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInnerGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInnerGroupMembersResponseBody body;

    public static GetInnerGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInnerGroupMembersResponse self = new GetInnerGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public GetInnerGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInnerGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInnerGroupMembersResponse setBody(GetInnerGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInnerGroupMembersResponseBody getBody() {
        return this.body;
    }

}
