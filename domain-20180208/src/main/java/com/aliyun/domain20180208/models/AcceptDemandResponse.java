// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class AcceptDemandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptDemandResponseBody body;

    public static AcceptDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptDemandResponse self = new AcceptDemandResponse();
        return TeaModel.build(map, self);
    }

    public AcceptDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptDemandResponse setBody(AcceptDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptDemandResponseBody getBody() {
        return this.body;
    }

}
