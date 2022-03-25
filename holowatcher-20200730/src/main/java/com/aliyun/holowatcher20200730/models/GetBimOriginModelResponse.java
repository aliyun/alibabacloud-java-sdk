// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimOriginModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimOriginModelResponseBody body;

    public static GetBimOriginModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimOriginModelResponse self = new GetBimOriginModelResponse();
        return TeaModel.build(map, self);
    }

    public GetBimOriginModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimOriginModelResponse setBody(GetBimOriginModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimOriginModelResponseBody getBody() {
        return this.body;
    }

}
