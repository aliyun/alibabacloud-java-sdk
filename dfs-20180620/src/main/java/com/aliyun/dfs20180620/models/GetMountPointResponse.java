// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetMountPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMountPointResponseBody body;

    public static GetMountPointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMountPointResponse self = new GetMountPointResponse();
        return TeaModel.build(map, self);
    }

    public GetMountPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMountPointResponse setBody(GetMountPointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMountPointResponseBody getBody() {
        return this.body;
    }

}
