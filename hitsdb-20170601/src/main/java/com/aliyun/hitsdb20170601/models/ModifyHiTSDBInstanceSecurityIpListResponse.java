// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class ModifyHiTSDBInstanceSecurityIpListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHiTSDBInstanceSecurityIpListResponseBody body;

    public static ModifyHiTSDBInstanceSecurityIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHiTSDBInstanceSecurityIpListResponse self = new ModifyHiTSDBInstanceSecurityIpListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHiTSDBInstanceSecurityIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHiTSDBInstanceSecurityIpListResponse setBody(ModifyHiTSDBInstanceSecurityIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHiTSDBInstanceSecurityIpListResponseBody getBody() {
        return this.body;
    }

}
