// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ConfirmPreBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmPreBillResponseBody body;

    public static ConfirmPreBillResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPreBillResponse self = new ConfirmPreBillResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmPreBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmPreBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmPreBillResponse setBody(ConfirmPreBillResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmPreBillResponseBody getBody() {
        return this.body;
    }

}
