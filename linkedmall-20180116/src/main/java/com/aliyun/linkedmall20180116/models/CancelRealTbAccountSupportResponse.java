// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CancelRealTbAccountSupportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelRealTbAccountSupportResponseBody body;

    public static CancelRealTbAccountSupportResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRealTbAccountSupportResponse self = new CancelRealTbAccountSupportResponse();
        return TeaModel.build(map, self);
    }

    public CancelRealTbAccountSupportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRealTbAccountSupportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRealTbAccountSupportResponse setBody(CancelRealTbAccountSupportResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRealTbAccountSupportResponseBody getBody() {
        return this.body;
    }

}
