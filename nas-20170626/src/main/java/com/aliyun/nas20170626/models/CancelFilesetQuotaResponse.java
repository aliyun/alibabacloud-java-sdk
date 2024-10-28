// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelFilesetQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelFilesetQuotaResponseBody body;

    public static CancelFilesetQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelFilesetQuotaResponse self = new CancelFilesetQuotaResponse();
        return TeaModel.build(map, self);
    }

    public CancelFilesetQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelFilesetQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelFilesetQuotaResponse setBody(CancelFilesetQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelFilesetQuotaResponseBody getBody() {
        return this.body;
    }

}
