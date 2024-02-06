// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleaseARMServerInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseARMServerInstanceResponseBody body;

    public static ReleaseARMServerInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseARMServerInstanceResponse self = new ReleaseARMServerInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseARMServerInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseARMServerInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseARMServerInstanceResponse setBody(ReleaseARMServerInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseARMServerInstanceResponseBody getBody() {
        return this.body;
    }

}
