// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetStsInfoAndOssPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStsInfoAndOssPathResponseBody body;

    public static GetStsInfoAndOssPathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStsInfoAndOssPathResponse self = new GetStsInfoAndOssPathResponse();
        return TeaModel.build(map, self);
    }

    public GetStsInfoAndOssPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStsInfoAndOssPathResponse setBody(GetStsInfoAndOssPathResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStsInfoAndOssPathResponseBody getBody() {
        return this.body;
    }

}
