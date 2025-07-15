// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCasterConfigResponseBody body;

    public static SetCasterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCasterConfigResponse self = new SetCasterConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetCasterConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCasterConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCasterConfigResponse setBody(SetCasterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCasterConfigResponseBody getBody() {
        return this.body;
    }

}
