// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class FailDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FailDemandResponseBody body;

    public static FailDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        FailDemandResponse self = new FailDemandResponse();
        return TeaModel.build(map, self);
    }

    public FailDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FailDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FailDemandResponse setBody(FailDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public FailDemandResponseBody getBody() {
        return this.body;
    }

}
