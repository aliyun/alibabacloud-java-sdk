// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class GetClusterDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterDetailResponseBody body;

    public static GetClusterDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDetailResponse self = new GetClusterDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterDetailResponse setBody(GetClusterDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterDetailResponseBody getBody() {
        return this.body;
    }

}
