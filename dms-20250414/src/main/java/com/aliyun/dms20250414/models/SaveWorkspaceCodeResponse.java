// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SaveWorkspaceCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveWorkspaceCodeResponseBody body;

    public static SaveWorkspaceCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveWorkspaceCodeResponse self = new SaveWorkspaceCodeResponse();
        return TeaModel.build(map, self);
    }

    public SaveWorkspaceCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveWorkspaceCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveWorkspaceCodeResponse setBody(SaveWorkspaceCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWorkspaceCodeResponseBody getBody() {
        return this.body;
    }

}
