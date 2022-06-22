// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWorkspaceMemberResponseBody body;

    public static UpdateWorkspaceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceMemberResponse self = new UpdateWorkspaceMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkspaceMemberResponse setBody(UpdateWorkspaceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceMemberResponseBody getBody() {
        return this.body;
    }

}
