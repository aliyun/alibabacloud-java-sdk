// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeAppByPidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRetcodeAppByPidResponseBody body;

    public static GetRetcodeAppByPidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeAppByPidResponse self = new GetRetcodeAppByPidResponse();
        return TeaModel.build(map, self);
    }

    public GetRetcodeAppByPidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRetcodeAppByPidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRetcodeAppByPidResponse setBody(GetRetcodeAppByPidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRetcodeAppByPidResponseBody getBody() {
        return this.body;
    }

}
