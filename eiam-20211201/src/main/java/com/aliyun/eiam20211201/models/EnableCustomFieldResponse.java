// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableCustomFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCustomFieldResponseBody body;

    public static EnableCustomFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomFieldResponse self = new EnableCustomFieldResponse();
        return TeaModel.build(map, self);
    }

    public EnableCustomFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCustomFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCustomFieldResponse setBody(EnableCustomFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCustomFieldResponseBody getBody() {
        return this.body;
    }

}
