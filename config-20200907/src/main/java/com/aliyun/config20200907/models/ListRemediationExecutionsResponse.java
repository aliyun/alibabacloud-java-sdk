// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRemediationExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRemediationExecutionsResponseBody body;

    public static ListRemediationExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationExecutionsResponse self = new ListRemediationExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRemediationExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRemediationExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRemediationExecutionsResponse setBody(ListRemediationExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRemediationExecutionsResponseBody getBody() {
        return this.body;
    }

}
