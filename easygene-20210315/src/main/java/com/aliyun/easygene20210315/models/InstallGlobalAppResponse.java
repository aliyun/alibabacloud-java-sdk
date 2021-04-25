// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class InstallGlobalAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InstallGlobalAppResponse setBody(InstallGlobalAppResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallGlobalAppResponseBody getBody() {
        return this.body;
    }

}
