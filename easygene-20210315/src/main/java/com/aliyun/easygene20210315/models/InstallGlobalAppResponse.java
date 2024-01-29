// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class InstallGlobalAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallGlobalAppResponseBody body;

    public static InstallGlobalAppResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallGlobalAppResponse self = new InstallGlobalAppResponse();
        return TeaModel.build(map, self);
    }

    public InstallGlobalAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallGlobalAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallGlobalAppResponse setBody(InstallGlobalAppResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallGlobalAppResponseBody getBody() {
        return this.body;
    }

}
