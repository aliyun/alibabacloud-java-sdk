// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupMemberResponseBody body;

    public static UpdateGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupMemberResponse self = new UpdateGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupMemberResponse setBody(UpdateGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupMemberResponseBody getBody() {
        return this.body;
    }

}
