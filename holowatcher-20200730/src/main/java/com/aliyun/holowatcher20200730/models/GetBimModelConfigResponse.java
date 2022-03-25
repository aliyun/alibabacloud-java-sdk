// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimModelConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimModelConfigResponseBody body;

    public static GetBimModelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimModelConfigResponse self = new GetBimModelConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetBimModelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimModelConfigResponse setBody(GetBimModelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimModelConfigResponseBody getBody() {
        return this.body;
    }

}
