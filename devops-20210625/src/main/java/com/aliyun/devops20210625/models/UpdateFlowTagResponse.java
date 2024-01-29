// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateFlowTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFlowTagResponseBody body;

    public static UpdateFlowTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowTagResponse self = new UpdateFlowTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlowTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlowTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFlowTagResponse setBody(UpdateFlowTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlowTagResponseBody getBody() {
        return this.body;
    }

}
