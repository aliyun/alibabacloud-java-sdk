// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRegistryModuleVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRegistryModuleVersionResponseBody body;

    public static GetRegistryModuleVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegistryModuleVersionResponse self = new GetRegistryModuleVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetRegistryModuleVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegistryModuleVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegistryModuleVersionResponse setBody(GetRegistryModuleVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegistryModuleVersionResponseBody getBody() {
        return this.body;
    }

}
