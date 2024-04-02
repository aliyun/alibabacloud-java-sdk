// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpgradeCdiBaseBagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeCdiBaseBagResponseBody body;

    public static UpgradeCdiBaseBagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeCdiBaseBagResponse self = new UpgradeCdiBaseBagResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeCdiBaseBagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeCdiBaseBagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeCdiBaseBagResponse setBody(UpgradeCdiBaseBagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeCdiBaseBagResponseBody getBody() {
        return this.body;
    }

}
