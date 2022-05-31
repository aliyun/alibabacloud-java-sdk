// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ChangeDistributorSubjectInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeDistributorSubjectInfoResponseBody body;

    public static ChangeDistributorSubjectInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDistributorSubjectInfoResponse self = new ChangeDistributorSubjectInfoResponse();
        return TeaModel.build(map, self);
    }

    public ChangeDistributorSubjectInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeDistributorSubjectInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeDistributorSubjectInfoResponse setBody(ChangeDistributorSubjectInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeDistributorSubjectInfoResponseBody getBody() {
        return this.body;
    }

}
