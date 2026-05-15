// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MuteMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MuteMembersResponseBody body;

    public static MuteMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        MuteMembersResponse self = new MuteMembersResponse();
        return TeaModel.build(map, self);
    }

    public MuteMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MuteMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MuteMembersResponse setBody(MuteMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public MuteMembersResponseBody getBody() {
        return this.body;
    }

}
