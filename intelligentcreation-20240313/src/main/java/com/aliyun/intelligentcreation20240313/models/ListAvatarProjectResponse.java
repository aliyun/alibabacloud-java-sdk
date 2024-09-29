// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAvatarProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvatarProjectResponseBody body;

    public static ListAvatarProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarProjectResponse self = new ListAvatarProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListAvatarProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvatarProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvatarProjectResponse setBody(ListAvatarProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvatarProjectResponseBody getBody() {
        return this.body;
    }

}
