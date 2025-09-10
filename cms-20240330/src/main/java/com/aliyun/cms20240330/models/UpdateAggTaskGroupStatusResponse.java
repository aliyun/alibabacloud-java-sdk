// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAggTaskGroupStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAggTaskGroupStatusResponseBody body;

    public static UpdateAggTaskGroupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggTaskGroupStatusResponse self = new UpdateAggTaskGroupStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAggTaskGroupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAggTaskGroupStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAggTaskGroupStatusResponse setBody(UpdateAggTaskGroupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAggTaskGroupStatusResponseBody getBody() {
        return this.body;
    }

}
