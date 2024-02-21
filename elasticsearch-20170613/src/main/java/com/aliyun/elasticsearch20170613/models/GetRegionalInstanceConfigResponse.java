// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetRegionalInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRegionalInstanceConfigResponseBody body;

    public static GetRegionalInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegionalInstanceConfigResponse self = new GetRegionalInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetRegionalInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegionalInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegionalInstanceConfigResponse setBody(GetRegionalInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegionalInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
