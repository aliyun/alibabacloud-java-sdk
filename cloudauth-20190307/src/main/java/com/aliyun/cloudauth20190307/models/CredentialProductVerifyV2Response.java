// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialProductVerifyV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CredentialProductVerifyV2ResponseBody body;

    public static CredentialProductVerifyV2Response build(java.util.Map<String, ?> map) throws Exception {
        CredentialProductVerifyV2Response self = new CredentialProductVerifyV2Response();
        return TeaModel.build(map, self);
    }

    public CredentialProductVerifyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CredentialProductVerifyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CredentialProductVerifyV2Response setBody(CredentialProductVerifyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CredentialProductVerifyV2ResponseBody getBody() {
        return this.body;
    }

}
