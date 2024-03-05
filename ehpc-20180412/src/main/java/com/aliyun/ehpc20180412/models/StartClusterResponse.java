// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartClusterResponseBody body;

    public static StartClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StartClusterResponse self = new StartClusterResponse();
        return TeaModel.build(map, self);
    }

    public StartClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartClusterResponse setBody(StartClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StartClusterResponseBody getBody() {
        return this.body;
    }

}
