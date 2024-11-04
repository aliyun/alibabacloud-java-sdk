// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetXDefaultConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetXDefaultConfigResponseBody body;

    public static GetXDefaultConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetXDefaultConfigResponse self = new GetXDefaultConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetXDefaultConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetXDefaultConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetXDefaultConfigResponse setBody(GetXDefaultConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetXDefaultConfigResponseBody getBody() {
        return this.body;
    }

}
