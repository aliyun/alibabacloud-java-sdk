// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateBusinessBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBusinessBaselineResponseBody body;

    public static UpdateBusinessBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessBaselineResponse self = new UpdateBusinessBaselineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBusinessBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBusinessBaselineResponse setBody(UpdateBusinessBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBusinessBaselineResponseBody getBody() {
        return this.body;
    }

}
