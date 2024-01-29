// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetEngineNamepaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEngineNamepaceResponseBody body;

    public static GetEngineNamepaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEngineNamepaceResponse self = new GetEngineNamepaceResponse();
        return TeaModel.build(map, self);
    }

    public GetEngineNamepaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEngineNamepaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEngineNamepaceResponse setBody(GetEngineNamepaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEngineNamepaceResponseBody getBody() {
        return this.body;
    }

}
