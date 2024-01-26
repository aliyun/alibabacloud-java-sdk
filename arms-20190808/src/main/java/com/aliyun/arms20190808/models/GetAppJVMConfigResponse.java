// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAppJVMConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppJVMConfigResponseBody body;

    public static GetAppJVMConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppJVMConfigResponse self = new GetAppJVMConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAppJVMConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppJVMConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppJVMConfigResponse setBody(GetAppJVMConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppJVMConfigResponseBody getBody() {
        return this.body;
    }

}
