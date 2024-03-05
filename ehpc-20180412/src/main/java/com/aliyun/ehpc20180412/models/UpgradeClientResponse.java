// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpgradeClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeClientResponseBody body;

    public static UpgradeClientResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClientResponse self = new UpgradeClientResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeClientResponse setBody(UpgradeClientResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeClientResponseBody getBody() {
        return this.body;
    }

}
