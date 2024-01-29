// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateResourceMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceMemberResponseBody body;

    public static UpdateResourceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceMemberResponse self = new UpdateResourceMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceMemberResponse setBody(UpdateResourceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceMemberResponseBody getBody() {
        return this.body;
    }

}
