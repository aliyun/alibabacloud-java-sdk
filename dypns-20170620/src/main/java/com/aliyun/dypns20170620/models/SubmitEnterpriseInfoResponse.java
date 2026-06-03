// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class SubmitEnterpriseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitEnterpriseInfoResponseBody body;

    public static SubmitEnterpriseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitEnterpriseInfoResponse self = new SubmitEnterpriseInfoResponse();
        return TeaModel.build(map, self);
    }

    public SubmitEnterpriseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitEnterpriseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitEnterpriseInfoResponse setBody(SubmitEnterpriseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitEnterpriseInfoResponseBody getBody() {
        return this.body;
    }

}
