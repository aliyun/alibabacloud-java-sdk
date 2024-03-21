// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AppendEntityMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AppendEntityMemberResponseBody body;

    public static AppendEntityMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AppendEntityMemberResponse self = new AppendEntityMemberResponse();
        return TeaModel.build(map, self);
    }

    public AppendEntityMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppendEntityMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppendEntityMemberResponse setBody(AppendEntityMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AppendEntityMemberResponseBody getBody() {
        return this.body;
    }

}
