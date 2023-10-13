// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetWarningThresholdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetWarningThresholdResponseBody body;

    public static SetWarningThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        SetWarningThresholdResponse self = new SetWarningThresholdResponse();
        return TeaModel.build(map, self);
    }

    public SetWarningThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetWarningThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetWarningThresholdResponse setBody(SetWarningThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public SetWarningThresholdResponseBody getBody() {
        return this.body;
    }

}
