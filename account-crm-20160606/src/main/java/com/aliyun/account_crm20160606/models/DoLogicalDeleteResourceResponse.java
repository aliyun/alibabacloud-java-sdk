// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class DoLogicalDeleteResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DoLogicalDeleteResourceResponseBody body;

    public static DoLogicalDeleteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DoLogicalDeleteResourceResponse self = new DoLogicalDeleteResourceResponse();
        return TeaModel.build(map, self);
    }

    public DoLogicalDeleteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoLogicalDeleteResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DoLogicalDeleteResourceResponse setBody(DoLogicalDeleteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DoLogicalDeleteResourceResponseBody getBody() {
        return this.body;
    }

}
