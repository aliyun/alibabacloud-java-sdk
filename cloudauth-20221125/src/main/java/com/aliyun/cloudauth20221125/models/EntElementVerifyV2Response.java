// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EntElementVerifyV2ResponseBody body;

    public static EntElementVerifyV2Response build(java.util.Map<String, ?> map) throws Exception {
        EntElementVerifyV2Response self = new EntElementVerifyV2Response();
        return TeaModel.build(map, self);
    }

    public EntElementVerifyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EntElementVerifyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EntElementVerifyV2Response setBody(EntElementVerifyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public EntElementVerifyV2ResponseBody getBody() {
        return this.body;
    }

}
