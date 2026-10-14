// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateAgenticDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgenticDataSourceResponseBody body;

    public static UpdateAgenticDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgenticDataSourceResponse self = new UpdateAgenticDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgenticDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgenticDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgenticDataSourceResponse setBody(UpdateAgenticDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgenticDataSourceResponseBody getBody() {
        return this.body;
    }

}
