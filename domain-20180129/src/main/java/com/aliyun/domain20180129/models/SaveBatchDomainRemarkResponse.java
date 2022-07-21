// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchDomainRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBatchDomainRemarkResponseBody body;

    public static SaveBatchDomainRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchDomainRemarkResponse self = new SaveBatchDomainRemarkResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchDomainRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchDomainRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchDomainRemarkResponse setBody(SaveBatchDomainRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchDomainRemarkResponseBody getBody() {
        return this.body;
    }

}
