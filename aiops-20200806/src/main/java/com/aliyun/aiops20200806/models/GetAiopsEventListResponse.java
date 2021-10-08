// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAiopsEventListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAiopsEventListResponseBody body;

    public static GetAiopsEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiopsEventListResponse self = new GetAiopsEventListResponse();
        return TeaModel.build(map, self);
    }

    public GetAiopsEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiopsEventListResponse setBody(GetAiopsEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiopsEventListResponseBody getBody() {
        return this.body;
    }

}
