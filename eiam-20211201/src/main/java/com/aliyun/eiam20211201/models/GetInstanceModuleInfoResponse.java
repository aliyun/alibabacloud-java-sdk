// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceModuleInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceModuleInfoResponseBody body;

    public static GetInstanceModuleInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceModuleInfoResponse self = new GetInstanceModuleInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceModuleInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceModuleInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceModuleInfoResponse setBody(GetInstanceModuleInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceModuleInfoResponseBody getBody() {
        return this.body;
    }

}
