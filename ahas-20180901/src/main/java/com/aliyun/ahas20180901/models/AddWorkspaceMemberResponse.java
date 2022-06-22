// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddWorkspaceMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddWorkspaceMemberResponseBody body;

    public static AddWorkspaceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceMemberResponse self = new AddWorkspaceMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWorkspaceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWorkspaceMemberResponse setBody(AddWorkspaceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorkspaceMemberResponseBody getBody() {
        return this.body;
    }

}
