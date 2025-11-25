// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateComputeResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeResourceResponseBody body;

    public static UpdateComputeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeResourceResponse self = new UpdateComputeResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeResourceResponse setBody(UpdateComputeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeResourceResponseBody getBody() {
        return this.body;
    }

}
