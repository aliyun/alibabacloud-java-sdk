// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ValidateDnsGtmAttributeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateDnsGtmAttributeInfoResponseBody body;

    public static ValidateDnsGtmAttributeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateDnsGtmAttributeInfoResponse self = new ValidateDnsGtmAttributeInfoResponse();
        return TeaModel.build(map, self);
    }

    public ValidateDnsGtmAttributeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateDnsGtmAttributeInfoResponse setBody(ValidateDnsGtmAttributeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateDnsGtmAttributeInfoResponseBody getBody() {
        return this.body;
    }

}
