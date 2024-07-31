// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateClusterConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClusterConfigsResponseBody body;

    public static UpdateClusterConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterConfigsResponse self = new UpdateClusterConfigsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClusterConfigsResponse setBody(UpdateClusterConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterConfigsResponseBody getBody() {
        return this.body;
    }

}
