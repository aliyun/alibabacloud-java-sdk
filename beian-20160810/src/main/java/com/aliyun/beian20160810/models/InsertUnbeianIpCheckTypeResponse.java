// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class InsertUnbeianIpCheckTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertUnbeianIpCheckTypeResponseBody body;

    public static InsertUnbeianIpCheckTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertUnbeianIpCheckTypeResponse self = new InsertUnbeianIpCheckTypeResponse();
        return TeaModel.build(map, self);
    }

    public InsertUnbeianIpCheckTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertUnbeianIpCheckTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertUnbeianIpCheckTypeResponse setBody(InsertUnbeianIpCheckTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertUnbeianIpCheckTypeResponseBody getBody() {
        return this.body;
    }

}
