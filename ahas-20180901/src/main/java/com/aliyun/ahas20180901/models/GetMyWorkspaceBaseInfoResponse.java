// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetMyWorkspaceBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMyWorkspaceBaseInfoResponseBody body;

    public static GetMyWorkspaceBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMyWorkspaceBaseInfoResponse self = new GetMyWorkspaceBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMyWorkspaceBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMyWorkspaceBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMyWorkspaceBaseInfoResponse setBody(GetMyWorkspaceBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMyWorkspaceBaseInfoResponseBody getBody() {
        return this.body;
    }

}
