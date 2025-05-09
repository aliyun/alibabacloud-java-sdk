// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SimplyAddInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SimplyAddInstanceResponseBody body;

    public static SimplyAddInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SimplyAddInstanceResponse self = new SimplyAddInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SimplyAddInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SimplyAddInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SimplyAddInstanceResponse setBody(SimplyAddInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SimplyAddInstanceResponseBody getBody() {
        return this.body;
    }

}
