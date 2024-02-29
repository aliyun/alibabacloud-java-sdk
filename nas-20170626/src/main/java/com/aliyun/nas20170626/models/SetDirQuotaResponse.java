// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class SetDirQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDirQuotaResponseBody body;

    public static SetDirQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDirQuotaResponse self = new SetDirQuotaResponse();
        return TeaModel.build(map, self);
    }

    public SetDirQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDirQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDirQuotaResponse setBody(SetDirQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDirQuotaResponseBody getBody() {
        return this.body;
    }

}
