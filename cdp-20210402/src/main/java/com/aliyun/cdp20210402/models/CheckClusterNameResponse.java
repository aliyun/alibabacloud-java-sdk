// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class CheckClusterNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckClusterNameResponseBody body;

    public static CheckClusterNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckClusterNameResponse self = new CheckClusterNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckClusterNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckClusterNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckClusterNameResponse setBody(CheckClusterNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckClusterNameResponseBody getBody() {
        return this.body;
    }

}
