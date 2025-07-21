// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ReleaseKmsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseKmsInstanceResponseBody body;

    public static ReleaseKmsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseKmsInstanceResponse self = new ReleaseKmsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseKmsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseKmsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseKmsInstanceResponse setBody(ReleaseKmsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseKmsInstanceResponseBody getBody() {
        return this.body;
    }

}
