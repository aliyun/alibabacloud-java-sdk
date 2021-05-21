// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetConfigNumListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigNumListResponseBody body;

    public static GetConfigNumListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigNumListResponse self = new GetConfigNumListResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigNumListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigNumListResponse setBody(GetConfigNumListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigNumListResponseBody getBody() {
        return this.body;
    }

}
