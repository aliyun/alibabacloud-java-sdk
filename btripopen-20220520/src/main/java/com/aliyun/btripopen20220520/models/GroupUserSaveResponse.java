// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupUserSaveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GroupUserSaveResponseBody body;

    public static GroupUserSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        GroupUserSaveResponse self = new GroupUserSaveResponse();
        return TeaModel.build(map, self);
    }

    public GroupUserSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GroupUserSaveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GroupUserSaveResponse setBody(GroupUserSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public GroupUserSaveResponseBody getBody() {
        return this.body;
    }

}
