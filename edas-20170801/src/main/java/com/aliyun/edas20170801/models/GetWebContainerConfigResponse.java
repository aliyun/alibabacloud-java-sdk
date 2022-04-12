// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetWebContainerConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWebContainerConfigResponseBody body;

    public static GetWebContainerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebContainerConfigResponse self = new GetWebContainerConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetWebContainerConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebContainerConfigResponse setBody(GetWebContainerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebContainerConfigResponseBody getBody() {
        return this.body;
    }

}
