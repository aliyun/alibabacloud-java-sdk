// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddWorkspaceUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddWorkspaceUserResponseBody body;

    public static AddWorkspaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceUserResponse self = new AddWorkspaceUserResponse();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWorkspaceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWorkspaceUserResponse setBody(AddWorkspaceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorkspaceUserResponseBody getBody() {
        return this.body;
    }

}
