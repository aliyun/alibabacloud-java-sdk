// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateKillInstanceSessionTaskWithMaintainUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKillInstanceSessionTaskWithMaintainUserResponseBody body;

    public static CreateKillInstanceSessionTaskWithMaintainUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKillInstanceSessionTaskWithMaintainUserResponse self = new CreateKillInstanceSessionTaskWithMaintainUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateKillInstanceSessionTaskWithMaintainUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKillInstanceSessionTaskWithMaintainUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKillInstanceSessionTaskWithMaintainUserResponse setBody(CreateKillInstanceSessionTaskWithMaintainUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKillInstanceSessionTaskWithMaintainUserResponseBody getBody() {
        return this.body;
    }

}
