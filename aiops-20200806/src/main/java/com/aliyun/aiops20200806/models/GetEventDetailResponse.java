// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEventDetailResponseBody body;

    public static GetEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventDetailResponse self = new GetEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventDetailResponse setBody(GetEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventDetailResponseBody getBody() {
        return this.body;
    }

}
