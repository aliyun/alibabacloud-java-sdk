// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class PrepareUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrepareUpgradeResponseBody body;

    public static PrepareUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        PrepareUpgradeResponse self = new PrepareUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public PrepareUpgradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrepareUpgradeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrepareUpgradeResponse setBody(PrepareUpgradeResponseBody body) {
        this.body = body;
        return this;
    }
    public PrepareUpgradeResponseBody getBody() {
        return this.body;
    }

}
