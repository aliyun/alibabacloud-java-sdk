// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcAddAppServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VpcAddAppServerResponseBody body;

    public static VpcAddAppServerResponse build(java.util.Map<String, ?> map) throws Exception {
        VpcAddAppServerResponse self = new VpcAddAppServerResponse();
        return TeaModel.build(map, self);
    }

    public VpcAddAppServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VpcAddAppServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VpcAddAppServerResponse setBody(VpcAddAppServerResponseBody body) {
        this.body = body;
        return this;
    }
    public VpcAddAppServerResponseBody getBody() {
        return this.body;
    }

}
