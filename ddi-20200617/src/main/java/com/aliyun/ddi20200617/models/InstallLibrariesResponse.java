// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class InstallLibrariesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstallLibrariesResponseBody body;

    public static InstallLibrariesResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallLibrariesResponse self = new InstallLibrariesResponse();
        return TeaModel.build(map, self);
    }

    public InstallLibrariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallLibrariesResponse setBody(InstallLibrariesResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallLibrariesResponseBody getBody() {
        return this.body;
    }

}
