// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class RefreshDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshDataSourceResponseBody body;

    public static RefreshDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshDataSourceResponse self = new RefreshDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public RefreshDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshDataSourceResponse setBody(RefreshDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDataSourceResponseBody getBody() {
        return this.body;
    }

}
