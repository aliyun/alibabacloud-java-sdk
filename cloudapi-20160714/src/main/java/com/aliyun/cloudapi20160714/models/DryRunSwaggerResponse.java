// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DryRunSwaggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DryRunSwaggerResponseBody body;

    public static DryRunSwaggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DryRunSwaggerResponse self = new DryRunSwaggerResponse();
        return TeaModel.build(map, self);
    }

    public DryRunSwaggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DryRunSwaggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DryRunSwaggerResponse setBody(DryRunSwaggerResponseBody body) {
        this.body = body;
        return this;
    }
    public DryRunSwaggerResponseBody getBody() {
        return this.body;
    }

}
