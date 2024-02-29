// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataSourceResponseBody body;

    public static UpdateDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceResponse self = new UpdateDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataSourceResponse setBody(UpdateDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataSourceResponseBody getBody() {
        return this.body;
    }

}
