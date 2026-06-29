// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class SetAgenticSpaceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAgenticSpaceQuotaResponseBody body;

    public static SetAgenticSpaceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAgenticSpaceQuotaResponse self = new SetAgenticSpaceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public SetAgenticSpaceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAgenticSpaceQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAgenticSpaceQuotaResponse setBody(SetAgenticSpaceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAgenticSpaceQuotaResponseBody getBody() {
        return this.body;
    }

}
