// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UpgradeMultiZoneClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeMultiZoneClusterResponseBody body;

    public static UpgradeMultiZoneClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMultiZoneClusterResponse self = new UpgradeMultiZoneClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeMultiZoneClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeMultiZoneClusterResponse setBody(UpgradeMultiZoneClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeMultiZoneClusterResponseBody getBody() {
        return this.body;
    }

}
