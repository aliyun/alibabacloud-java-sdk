// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ManualModerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManualModerationResponseBody body;

    public static ManualModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        ManualModerationResponse self = new ManualModerationResponse();
        return TeaModel.build(map, self);
    }

    public ManualModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManualModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManualModerationResponse setBody(ManualModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public ManualModerationResponseBody getBody() {
        return this.body;
    }

}
