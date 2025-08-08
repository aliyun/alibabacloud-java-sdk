// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class ModifyInvoiceForIsvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInvoiceForIsvResponseBody body;

    public static ModifyInvoiceForIsvResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInvoiceForIsvResponse self = new ModifyInvoiceForIsvResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInvoiceForIsvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInvoiceForIsvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInvoiceForIsvResponse setBody(ModifyInvoiceForIsvResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInvoiceForIsvResponseBody getBody() {
        return this.body;
    }

}
