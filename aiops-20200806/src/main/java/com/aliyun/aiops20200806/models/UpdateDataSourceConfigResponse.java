// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateDataSourceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataSourceConfigResponseBody body;

    public static UpdateDataSourceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceConfigResponse self = new UpdateDataSourceConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataSourceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataSourceConfigResponse setBody(UpdateDataSourceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataSourceConfigResponseBody getBody() {
        return this.body;
    }

}
