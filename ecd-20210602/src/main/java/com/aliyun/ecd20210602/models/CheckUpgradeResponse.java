// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CheckUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUpgradeResponseBody body;

    public static CheckUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUpgradeResponse self = new CheckUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public CheckUpgradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUpgradeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUpgradeResponse setBody(CheckUpgradeResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUpgradeResponseBody getBody() {
        return this.body;
    }

}
