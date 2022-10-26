// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class OpenRealTbAccountSupportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenRealTbAccountSupportResponseBody body;

    public static OpenRealTbAccountSupportResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenRealTbAccountSupportResponse self = new OpenRealTbAccountSupportResponse();
        return TeaModel.build(map, self);
    }

    public OpenRealTbAccountSupportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenRealTbAccountSupportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenRealTbAccountSupportResponse setBody(OpenRealTbAccountSupportResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenRealTbAccountSupportResponseBody getBody() {
        return this.body;
    }

}
