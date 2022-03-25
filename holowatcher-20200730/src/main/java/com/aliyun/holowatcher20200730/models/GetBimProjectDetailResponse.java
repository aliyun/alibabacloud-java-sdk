// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimProjectDetailResponseBody body;

    public static GetBimProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectDetailResponse self = new GetBimProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetBimProjectDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimProjectDetailResponse setBody(GetBimProjectDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimProjectDetailResponseBody getBody() {
        return this.body;
    }

}
