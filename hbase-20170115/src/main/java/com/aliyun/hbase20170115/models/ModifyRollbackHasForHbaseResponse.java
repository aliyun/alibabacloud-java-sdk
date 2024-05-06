// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyRollbackHasForHbaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRollbackHasForHbaseResponseBody body;

    public static ModifyRollbackHasForHbaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRollbackHasForHbaseResponse self = new ModifyRollbackHasForHbaseResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRollbackHasForHbaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRollbackHasForHbaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRollbackHasForHbaseResponse setBody(ModifyRollbackHasForHbaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRollbackHasForHbaseResponseBody getBody() {
        return this.body;
    }

}
