// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardRenderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimStandardRenderResponseBody body;

    public static GetBimStandardRenderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardRenderResponse self = new GetBimStandardRenderResponse();
        return TeaModel.build(map, self);
    }

    public GetBimStandardRenderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimStandardRenderResponse setBody(GetBimStandardRenderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimStandardRenderResponseBody getBody() {
        return this.body;
    }

}
