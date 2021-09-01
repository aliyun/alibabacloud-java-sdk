// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetEdgeAbilitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEdgeAbilitiesResponseBody body;

    public static GetEdgeAbilitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeAbilitiesResponse self = new GetEdgeAbilitiesResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeAbilitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeAbilitiesResponse setBody(GetEdgeAbilitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeAbilitiesResponseBody getBody() {
        return this.body;
    }

}
