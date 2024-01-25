// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class SwitchUserTopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchUserTopResponseBody body;

    public static SwitchUserTopResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchUserTopResponse self = new SwitchUserTopResponse();
        return TeaModel.build(map, self);
    }

    public SwitchUserTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchUserTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchUserTopResponse setBody(SwitchUserTopResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchUserTopResponseBody getBody() {
        return this.body;
    }

}
