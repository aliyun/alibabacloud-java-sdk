// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ManualModerationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManualModerationResultResponseBody body;

    public static ManualModerationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ManualModerationResultResponse self = new ManualModerationResultResponse();
        return TeaModel.build(map, self);
    }

    public ManualModerationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManualModerationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManualModerationResultResponse setBody(ManualModerationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ManualModerationResultResponseBody getBody() {
        return this.body;
    }

}
