// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceAccessWhiteListResponseBody body;

    public static ModifyDBInstanceAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAccessWhiteListResponse self = new ModifyDBInstanceAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAccessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceAccessWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceAccessWhiteListResponse setBody(ModifyDBInstanceAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}
