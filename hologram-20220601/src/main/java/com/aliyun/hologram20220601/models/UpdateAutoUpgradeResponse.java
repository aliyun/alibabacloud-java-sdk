// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateAutoUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAutoUpgradeResponseBody body;

    public static UpdateAutoUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoUpgradeResponse self = new UpdateAutoUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoUpgradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoUpgradeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoUpgradeResponse setBody(UpdateAutoUpgradeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoUpgradeResponseBody getBody() {
        return this.body;
    }

}
