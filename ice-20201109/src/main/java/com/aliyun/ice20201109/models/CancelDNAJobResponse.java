// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CancelDNAJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelDNAJobResponseBody body;

    public static CancelDNAJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDNAJobResponse self = new CancelDNAJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelDNAJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDNAJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelDNAJobResponse setBody(CancelDNAJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDNAJobResponseBody getBody() {
        return this.body;
    }

}
