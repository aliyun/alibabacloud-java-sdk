// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class RenameHiTSDBInstanceAliasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenameHiTSDBInstanceAliasResponseBody body;

    public static RenameHiTSDBInstanceAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameHiTSDBInstanceAliasResponse self = new RenameHiTSDBInstanceAliasResponse();
        return TeaModel.build(map, self);
    }

    public RenameHiTSDBInstanceAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameHiTSDBInstanceAliasResponse setBody(RenameHiTSDBInstanceAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameHiTSDBInstanceAliasResponseBody getBody() {
        return this.body;
    }

}
