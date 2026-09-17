// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialSubmitIntlV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CredentialSubmitIntlV2ResponseBody body;

    public static CredentialSubmitIntlV2Response build(java.util.Map<String, ?> map) throws Exception {
        CredentialSubmitIntlV2Response self = new CredentialSubmitIntlV2Response();
        return TeaModel.build(map, self);
    }

    public CredentialSubmitIntlV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CredentialSubmitIntlV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CredentialSubmitIntlV2Response setBody(CredentialSubmitIntlV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CredentialSubmitIntlV2ResponseBody getBody() {
        return this.body;
    }

}
