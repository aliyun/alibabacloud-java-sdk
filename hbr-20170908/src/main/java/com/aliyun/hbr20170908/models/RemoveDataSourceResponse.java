// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class RemoveDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveDataSourceResponseBody body;

    public static RemoveDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataSourceResponse self = new RemoveDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDataSourceResponse setBody(RemoveDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDataSourceResponseBody getBody() {
        return this.body;
    }

}
