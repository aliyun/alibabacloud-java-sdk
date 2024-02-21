// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnDeliverTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCdnDeliverTaskResponseBody body;

    public static UpdateCdnDeliverTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCdnDeliverTaskResponse self = new UpdateCdnDeliverTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCdnDeliverTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCdnDeliverTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCdnDeliverTaskResponse setBody(UpdateCdnDeliverTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

}
