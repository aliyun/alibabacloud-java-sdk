// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CheckUpgradeItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckUpgradeItemResponseBody body;

    public static CheckUpgradeItemResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUpgradeItemResponse self = new CheckUpgradeItemResponse();
        return TeaModel.build(map, self);
    }

    public CheckUpgradeItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUpgradeItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUpgradeItemResponse setBody(CheckUpgradeItemResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUpgradeItemResponseBody getBody() {
        return this.body;
    }

}
