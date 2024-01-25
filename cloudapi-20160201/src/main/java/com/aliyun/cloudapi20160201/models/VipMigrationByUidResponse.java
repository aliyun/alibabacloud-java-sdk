// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VipMigrationByUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VipMigrationByUidResponseBody body;

    public static VipMigrationByUidResponse build(java.util.Map<String, ?> map) throws Exception {
        VipMigrationByUidResponse self = new VipMigrationByUidResponse();
        return TeaModel.build(map, self);
    }

    public VipMigrationByUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VipMigrationByUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VipMigrationByUidResponse setBody(VipMigrationByUidResponseBody body) {
        this.body = body;
        return this;
    }
    public VipMigrationByUidResponseBody getBody() {
        return this.body;
    }

}
