// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetJavaStartUpConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJavaStartUpConfigResponseBody body;

    public static GetJavaStartUpConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJavaStartUpConfigResponse self = new GetJavaStartUpConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetJavaStartUpConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJavaStartUpConfigResponse setBody(GetJavaStartUpConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJavaStartUpConfigResponseBody getBody() {
        return this.body;
    }

}
