// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopGWSInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopGWSInstanceResponseBody body;

    public static StopGWSInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopGWSInstanceResponse self = new StopGWSInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopGWSInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopGWSInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopGWSInstanceResponse setBody(StopGWSInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopGWSInstanceResponseBody getBody() {
        return this.body;
    }

}
