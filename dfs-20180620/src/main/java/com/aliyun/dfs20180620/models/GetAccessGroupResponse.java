// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetAccessGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccessGroupResponseBody body;

    public static GetAccessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessGroupResponse self = new GetAccessGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessGroupResponse setBody(GetAccessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessGroupResponseBody getBody() {
        return this.body;
    }

}
