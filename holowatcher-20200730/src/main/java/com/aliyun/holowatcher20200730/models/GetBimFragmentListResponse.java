// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimFragmentListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimFragmentListResponseBody body;

    public static GetBimFragmentListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimFragmentListResponse self = new GetBimFragmentListResponse();
        return TeaModel.build(map, self);
    }

    public GetBimFragmentListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimFragmentListResponse setBody(GetBimFragmentListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimFragmentListResponseBody getBody() {
        return this.body;
    }

}
