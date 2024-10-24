// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class OperateAvatarProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateAvatarProjectResponseBody body;

    public static OperateAvatarProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateAvatarProjectResponse self = new OperateAvatarProjectResponse();
        return TeaModel.build(map, self);
    }

    public OperateAvatarProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateAvatarProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateAvatarProjectResponse setBody(OperateAvatarProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateAvatarProjectResponseBody getBody() {
        return this.body;
    }

}
