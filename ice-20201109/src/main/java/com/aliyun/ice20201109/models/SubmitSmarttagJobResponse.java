// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmarttagJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSmarttagJobResponseBody body;

    public static SubmitSmarttagJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmarttagJobResponse self = new SubmitSmarttagJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmarttagJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSmarttagJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSmarttagJobResponse setBody(SubmitSmarttagJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSmarttagJobResponseBody getBody() {
        return this.body;
    }

}
