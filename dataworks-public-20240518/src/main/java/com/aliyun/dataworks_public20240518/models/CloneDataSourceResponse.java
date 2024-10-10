// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CloneDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneDataSourceResponseBody body;

    public static CloneDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneDataSourceResponse self = new CloneDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CloneDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneDataSourceResponse setBody(CloneDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneDataSourceResponseBody getBody() {
        return this.body;
    }

}
