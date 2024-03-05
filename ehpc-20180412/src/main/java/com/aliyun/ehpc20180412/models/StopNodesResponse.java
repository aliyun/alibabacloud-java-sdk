// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopNodesResponseBody body;

    public static StopNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopNodesResponse self = new StopNodesResponse();
        return TeaModel.build(map, self);
    }

    public StopNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopNodesResponse setBody(StopNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopNodesResponseBody getBody() {
        return this.body;
    }

}
