// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateMyWorkspaceBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMyWorkspaceBaseInfoResponseBody body;

    public static UpdateMyWorkspaceBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMyWorkspaceBaseInfoResponse self = new UpdateMyWorkspaceBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMyWorkspaceBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMyWorkspaceBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMyWorkspaceBaseInfoResponse setBody(UpdateMyWorkspaceBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMyWorkspaceBaseInfoResponseBody getBody() {
        return this.body;
    }

}
