// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsureOrderApplyResponseBody body;

    public static InsureOrderApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderApplyResponse self = new InsureOrderApplyResponse();
        return TeaModel.build(map, self);
    }

    public InsureOrderApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsureOrderApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsureOrderApplyResponse setBody(InsureOrderApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public InsureOrderApplyResponseBody getBody() {
        return this.body;
    }

}
