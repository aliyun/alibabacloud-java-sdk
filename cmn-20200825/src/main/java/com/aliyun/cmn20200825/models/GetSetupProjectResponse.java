// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSetupProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSetupProjectResponseBody body;

    public static GetSetupProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSetupProjectResponse self = new GetSetupProjectResponse();
        return TeaModel.build(map, self);
    }

    public GetSetupProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSetupProjectResponse setBody(GetSetupProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSetupProjectResponseBody getBody() {
        return this.body;
    }

}
