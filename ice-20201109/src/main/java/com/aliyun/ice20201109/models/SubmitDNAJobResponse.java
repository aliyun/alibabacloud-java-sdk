// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDNAJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDNAJobResponseBody body;

    public static SubmitDNAJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDNAJobResponse self = new SubmitDNAJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDNAJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDNAJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDNAJobResponse setBody(SubmitDNAJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDNAJobResponseBody getBody() {
        return this.body;
    }

}
