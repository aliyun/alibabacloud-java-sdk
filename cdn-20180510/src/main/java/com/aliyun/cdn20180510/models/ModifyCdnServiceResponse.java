// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCdnServiceResponseBody body;

    public static ModifyCdnServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnServiceResponse self = new ModifyCdnServiceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCdnServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCdnServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCdnServiceResponse setBody(ModifyCdnServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCdnServiceResponseBody getBody() {
        return this.body;
    }

}
