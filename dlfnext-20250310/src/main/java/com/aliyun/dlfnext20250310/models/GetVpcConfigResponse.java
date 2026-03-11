// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetVpcConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpcConfigResponseBody body;

    public static GetVpcConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpcConfigResponse self = new GetVpcConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetVpcConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpcConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpcConfigResponse setBody(GetVpcConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcConfigResponseBody getBody() {
        return this.body;
    }

}
