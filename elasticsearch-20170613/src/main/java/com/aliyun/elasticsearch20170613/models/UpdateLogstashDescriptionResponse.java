// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLogstashDescriptionResponseBody body;

    public static UpdateLogstashDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashDescriptionResponse self = new UpdateLogstashDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLogstashDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLogstashDescriptionResponse setBody(UpdateLogstashDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLogstashDescriptionResponseBody getBody() {
        return this.body;
    }

}
