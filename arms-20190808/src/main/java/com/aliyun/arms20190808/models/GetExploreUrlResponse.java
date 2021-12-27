// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetExploreUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetExploreUrlResponseBody body;

    public static GetExploreUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExploreUrlResponse self = new GetExploreUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetExploreUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExploreUrlResponse setBody(GetExploreUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExploreUrlResponseBody getBody() {
        return this.body;
    }

}
