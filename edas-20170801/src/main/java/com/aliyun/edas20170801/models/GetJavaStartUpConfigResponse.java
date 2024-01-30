// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetJavaStartUpConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetJavaStartUpConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJavaStartUpConfigResponse setBody(GetJavaStartUpConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJavaStartUpConfigResponseBody getBody() {
        return this.body;
    }

}
