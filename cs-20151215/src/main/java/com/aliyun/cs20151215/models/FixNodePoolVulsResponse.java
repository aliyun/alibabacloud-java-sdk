// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class FixNodePoolVulsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FixNodePoolVulsResponseBody body;

    public static FixNodePoolVulsResponse build(java.util.Map<String, ?> map) throws Exception {
        FixNodePoolVulsResponse self = new FixNodePoolVulsResponse();
        return TeaModel.build(map, self);
    }

    public FixNodePoolVulsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FixNodePoolVulsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FixNodePoolVulsResponse setBody(FixNodePoolVulsResponseBody body) {
        this.body = body;
        return this;
    }
    public FixNodePoolVulsResponseBody getBody() {
        return this.body;
    }

}
