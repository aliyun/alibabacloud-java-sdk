// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMemberResponseBody body;

    public static GetMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemberResponse self = new GetMemberResponse();
        return TeaModel.build(map, self);
    }

    public GetMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemberResponse setBody(GetMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemberResponseBody getBody() {
        return this.body;
    }

}
