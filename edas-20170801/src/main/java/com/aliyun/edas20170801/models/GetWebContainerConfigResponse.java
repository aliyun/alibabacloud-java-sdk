// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetWebContainerConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetWebContainerConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWebContainerConfigResponse setBody(GetWebContainerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebContainerConfigResponseBody getBody() {
        return this.body;
    }

}
