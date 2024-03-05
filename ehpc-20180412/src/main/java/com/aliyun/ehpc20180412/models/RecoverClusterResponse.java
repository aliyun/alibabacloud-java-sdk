// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RecoverClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverClusterResponseBody body;

    public static RecoverClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverClusterResponse self = new RecoverClusterResponse();
        return TeaModel.build(map, self);
    }

    public RecoverClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverClusterResponse setBody(RecoverClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverClusterResponseBody getBody() {
        return this.body;
    }

}
