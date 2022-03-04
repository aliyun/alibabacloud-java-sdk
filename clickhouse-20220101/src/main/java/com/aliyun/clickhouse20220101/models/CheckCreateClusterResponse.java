// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckCreateClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckCreateClusterResponseBody body;

    public static CheckCreateClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateClusterResponse self = new CheckCreateClusterResponse();
        return TeaModel.build(map, self);
    }

    public CheckCreateClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCreateClusterResponse setBody(CheckCreateClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCreateClusterResponseBody getBody() {
        return this.body;
    }

}
