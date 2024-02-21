// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateApmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApmResponseBody body;

    public static UpdateApmResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApmResponse self = new UpdateApmResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApmResponse setBody(UpdateApmResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApmResponseBody getBody() {
        return this.body;
    }

}
