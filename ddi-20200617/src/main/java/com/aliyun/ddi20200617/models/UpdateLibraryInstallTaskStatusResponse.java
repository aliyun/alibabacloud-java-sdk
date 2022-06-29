// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class UpdateLibraryInstallTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLibraryInstallTaskStatusResponseBody body;

    public static UpdateLibraryInstallTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibraryInstallTaskStatusResponse self = new UpdateLibraryInstallTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLibraryInstallTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLibraryInstallTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLibraryInstallTaskStatusResponse setBody(UpdateLibraryInstallTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLibraryInstallTaskStatusResponseBody getBody() {
        return this.body;
    }

}
