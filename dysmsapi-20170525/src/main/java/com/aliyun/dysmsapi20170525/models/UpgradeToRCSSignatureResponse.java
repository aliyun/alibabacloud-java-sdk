// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpgradeToRCSSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeToRCSSignatureResponseBody body;

    public static UpgradeToRCSSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeToRCSSignatureResponse self = new UpgradeToRCSSignatureResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeToRCSSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeToRCSSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeToRCSSignatureResponse setBody(UpgradeToRCSSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeToRCSSignatureResponseBody getBody() {
        return this.body;
    }

}
