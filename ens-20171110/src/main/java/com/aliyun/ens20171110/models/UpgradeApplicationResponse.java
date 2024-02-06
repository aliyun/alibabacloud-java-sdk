// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeApplicationResponseBody body;

    public static UpgradeApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeApplicationResponse self = new UpgradeApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeApplicationResponse setBody(UpgradeApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeApplicationResponseBody getBody() {
        return this.body;
    }

}
