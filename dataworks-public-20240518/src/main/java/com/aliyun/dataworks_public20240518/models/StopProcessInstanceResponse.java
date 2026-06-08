// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopProcessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopProcessInstanceResponseBody body;

    public static StopProcessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopProcessInstanceResponse self = new StopProcessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopProcessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopProcessInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopProcessInstanceResponse setBody(StopProcessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopProcessInstanceResponseBody getBody() {
        return this.body;
    }

}
