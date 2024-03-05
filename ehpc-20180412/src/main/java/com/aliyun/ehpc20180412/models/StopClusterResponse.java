// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopClusterResponseBody body;

    public static StopClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StopClusterResponse self = new StopClusterResponse();
        return TeaModel.build(map, self);
    }

    public StopClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopClusterResponse setBody(StopClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StopClusterResponseBody getBody() {
        return this.body;
    }

}
