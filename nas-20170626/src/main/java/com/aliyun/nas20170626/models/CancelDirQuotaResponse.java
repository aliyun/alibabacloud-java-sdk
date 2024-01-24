// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDirQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelDirQuotaResponseBody body;

    public static CancelDirQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDirQuotaResponse self = new CancelDirQuotaResponse();
        return TeaModel.build(map, self);
    }

    public CancelDirQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDirQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelDirQuotaResponse setBody(CancelDirQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDirQuotaResponseBody getBody() {
        return this.body;
    }

}
