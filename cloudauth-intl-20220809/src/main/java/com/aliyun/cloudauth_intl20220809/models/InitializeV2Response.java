// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class InitializeV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitializeV2ResponseBody body;

    public static InitializeV2Response build(java.util.Map<String, ?> map) throws Exception {
        InitializeV2Response self = new InitializeV2Response();
        return TeaModel.build(map, self);
    }

    public InitializeV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeV2Response setBody(InitializeV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeV2ResponseBody getBody() {
        return this.body;
    }

}
