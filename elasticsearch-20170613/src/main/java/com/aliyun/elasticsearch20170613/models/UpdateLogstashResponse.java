// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLogstashResponseBody body;

    public static UpdateLogstashResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashResponse self = new UpdateLogstashResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLogstashResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLogstashResponse setBody(UpdateLogstashResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLogstashResponseBody getBody() {
        return this.body;
    }

}
