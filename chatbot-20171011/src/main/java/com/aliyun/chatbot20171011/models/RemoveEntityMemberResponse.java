// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class RemoveEntityMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveEntityMemberResponseBody body;

    public static RemoveEntityMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntityMemberResponse self = new RemoveEntityMemberResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEntityMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveEntityMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveEntityMemberResponse setBody(RemoveEntityMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEntityMemberResponseBody getBody() {
        return this.body;
    }

}
