// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ExpandClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExpandClusterResponseBody body;

    public static ExpandClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ExpandClusterResponse self = new ExpandClusterResponse();
        return TeaModel.build(map, self);
    }

    public ExpandClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExpandClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExpandClusterResponse setBody(ExpandClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ExpandClusterResponseBody getBody() {
        return this.body;
    }

}
