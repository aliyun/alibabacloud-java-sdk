// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class SeparateAgRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SeparateAgRelationResponseBody body;

    public static SeparateAgRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        SeparateAgRelationResponse self = new SeparateAgRelationResponse();
        return TeaModel.build(map, self);
    }

    public SeparateAgRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SeparateAgRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SeparateAgRelationResponse setBody(SeparateAgRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public SeparateAgRelationResponseBody getBody() {
        return this.body;
    }

}
