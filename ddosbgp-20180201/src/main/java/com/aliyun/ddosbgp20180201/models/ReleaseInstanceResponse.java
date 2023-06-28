// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180201.models;

import com.aliyun.tea.*;

public class ReleaseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseInstanceResponseBody body;

    public static ReleaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceResponse self = new ReleaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseInstanceResponse setBody(ReleaseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseInstanceResponseBody getBody() {
        return this.body;
    }

}
