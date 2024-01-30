// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateContainerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContainerResponseBody body;

    public static UpdateContainerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerResponse self = new UpdateContainerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContainerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContainerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContainerResponse setBody(UpdateContainerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContainerResponseBody getBody() {
        return this.body;
    }

}
