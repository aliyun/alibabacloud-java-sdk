// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SaveAvatarProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveAvatarProjectResponseBody body;

    public static SaveAvatarProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAvatarProjectResponse self = new SaveAvatarProjectResponse();
        return TeaModel.build(map, self);
    }

    public SaveAvatarProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAvatarProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveAvatarProjectResponse setBody(SaveAvatarProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAvatarProjectResponseBody getBody() {
        return this.body;
    }

}
