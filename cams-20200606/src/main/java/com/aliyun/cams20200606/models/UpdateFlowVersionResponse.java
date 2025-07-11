// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFlowVersionResponseBody body;

    public static UpdateFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowVersionResponse self = new UpdateFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlowVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFlowVersionResponse setBody(UpdateFlowVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlowVersionResponseBody getBody() {
        return this.body;
    }

}
