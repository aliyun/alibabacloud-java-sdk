// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateClusterSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClusterSpecResponseBody body;

    public static UpdateClusterSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterSpecResponse self = new UpdateClusterSpecResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClusterSpecResponse setBody(UpdateClusterSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterSpecResponseBody getBody() {
        return this.body;
    }

}
