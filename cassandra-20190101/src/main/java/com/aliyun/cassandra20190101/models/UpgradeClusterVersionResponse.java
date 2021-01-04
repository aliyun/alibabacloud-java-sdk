// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class UpgradeClusterVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeClusterVersionResponseBody body;

    public static UpgradeClusterVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterVersionResponse self = new UpgradeClusterVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeClusterVersionResponse setBody(UpgradeClusterVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeClusterVersionResponseBody getBody() {
        return this.body;
    }

}
