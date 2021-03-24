// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class MuteUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MuteUsersResponseBody body;

    public static MuteUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        MuteUsersResponse self = new MuteUsersResponse();
        return TeaModel.build(map, self);
    }

    public MuteUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MuteUsersResponse setBody(MuteUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public MuteUsersResponseBody getBody() {
        return this.body;
    }

}
