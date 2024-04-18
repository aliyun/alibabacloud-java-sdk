// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UpgradeMultiZoneClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpgradeMultiZoneClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeMultiZoneClusterResponse setBody(UpgradeMultiZoneClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeMultiZoneClusterResponseBody getBody() {
        return this.body;
    }

}
