// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHostGroupResponseBody body;

    public static GetHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHostGroupResponse self = new GetHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHostGroupResponse setBody(GetHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHostGroupResponseBody getBody() {
        return this.body;
    }

}
