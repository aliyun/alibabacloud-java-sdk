// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class SetUserConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetUserConfigsResponseBody body;

    public static SetUserConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserConfigsResponse self = new SetUserConfigsResponse();
        return TeaModel.build(map, self);
    }

    public SetUserConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUserConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetUserConfigsResponse setBody(SetUserConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUserConfigsResponseBody getBody() {
        return this.body;
    }

}
