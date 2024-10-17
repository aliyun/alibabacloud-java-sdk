// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetNotifyConfigResponseBody body;

    public static SetNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetNotifyConfigResponse self = new SetNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetNotifyConfigResponse setBody(SetNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
