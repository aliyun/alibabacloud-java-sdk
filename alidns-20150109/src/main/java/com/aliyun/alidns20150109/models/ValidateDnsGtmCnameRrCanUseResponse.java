// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ValidateDnsGtmCnameRrCanUseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateDnsGtmCnameRrCanUseResponseBody body;

    public static ValidateDnsGtmCnameRrCanUseResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateDnsGtmCnameRrCanUseResponse self = new ValidateDnsGtmCnameRrCanUseResponse();
        return TeaModel.build(map, self);
    }

    public ValidateDnsGtmCnameRrCanUseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateDnsGtmCnameRrCanUseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateDnsGtmCnameRrCanUseResponse setBody(ValidateDnsGtmCnameRrCanUseResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateDnsGtmCnameRrCanUseResponseBody getBody() {
        return this.body;
    }

}
