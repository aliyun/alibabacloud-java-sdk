// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAppApiByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppApiByPageResponseBody body;

    public static GetAppApiByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppApiByPageResponse self = new GetAppApiByPageResponse();
        return TeaModel.build(map, self);
    }

    public GetAppApiByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppApiByPageResponse setBody(GetAppApiByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppApiByPageResponseBody getBody() {
        return this.body;
    }

}
