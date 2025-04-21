// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CredentialVerifyV2ResponseBody body;

    public static CredentialVerifyV2Response build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyV2Response self = new CredentialVerifyV2Response();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CredentialVerifyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CredentialVerifyV2Response setBody(CredentialVerifyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CredentialVerifyV2ResponseBody getBody() {
        return this.body;
    }

}
