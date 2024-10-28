// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class SetFilesetQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetFilesetQuotaResponseBody body;

    public static SetFilesetQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        SetFilesetQuotaResponse self = new SetFilesetQuotaResponse();
        return TeaModel.build(map, self);
    }

    public SetFilesetQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetFilesetQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetFilesetQuotaResponse setBody(SetFilesetQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public SetFilesetQuotaResponseBody getBody() {
        return this.body;
    }

}
