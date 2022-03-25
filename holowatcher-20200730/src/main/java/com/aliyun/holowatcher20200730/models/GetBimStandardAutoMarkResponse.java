// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardAutoMarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimStandardAutoMarkResponseBody body;

    public static GetBimStandardAutoMarkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardAutoMarkResponse self = new GetBimStandardAutoMarkResponse();
        return TeaModel.build(map, self);
    }

    public GetBimStandardAutoMarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimStandardAutoMarkResponse setBody(GetBimStandardAutoMarkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimStandardAutoMarkResponseBody getBody() {
        return this.body;
    }

}
