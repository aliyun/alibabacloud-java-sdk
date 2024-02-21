// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLogstashChargeTypeResponseBody body;

    public static UpdateLogstashChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashChargeTypeResponse self = new UpdateLogstashChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLogstashChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLogstashChargeTypeResponse setBody(UpdateLogstashChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLogstashChargeTypeResponseBody getBody() {
        return this.body;
    }

}
