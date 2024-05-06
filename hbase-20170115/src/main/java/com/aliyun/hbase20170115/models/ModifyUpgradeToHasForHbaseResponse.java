// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyUpgradeToHasForHbaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUpgradeToHasForHbaseResponseBody body;

    public static ModifyUpgradeToHasForHbaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUpgradeToHasForHbaseResponse self = new ModifyUpgradeToHasForHbaseResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUpgradeToHasForHbaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUpgradeToHasForHbaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUpgradeToHasForHbaseResponse setBody(ModifyUpgradeToHasForHbaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUpgradeToHasForHbaseResponseBody getBody() {
        return this.body;
    }

}
