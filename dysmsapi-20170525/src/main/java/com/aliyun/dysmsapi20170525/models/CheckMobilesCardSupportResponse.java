// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CheckMobilesCardSupportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckMobilesCardSupportResponseBody body;

    public static CheckMobilesCardSupportResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMobilesCardSupportResponse self = new CheckMobilesCardSupportResponse();
        return TeaModel.build(map, self);
    }

    public CheckMobilesCardSupportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMobilesCardSupportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckMobilesCardSupportResponse setBody(CheckMobilesCardSupportResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMobilesCardSupportResponseBody getBody() {
        return this.body;
    }

}
