// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpgradeHiStoreInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeHiStoreInstanceResponseBody body;

    public static UpgradeHiStoreInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeHiStoreInstanceResponse self = new UpgradeHiStoreInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeHiStoreInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeHiStoreInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeHiStoreInstanceResponse setBody(UpgradeHiStoreInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeHiStoreInstanceResponseBody getBody() {
        return this.body;
    }

}
