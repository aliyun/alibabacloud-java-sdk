// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyRDSToClickhouseDbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRDSToClickhouseDbResponseBody body;

    public static ModifyRDSToClickhouseDbResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRDSToClickhouseDbResponse self = new ModifyRDSToClickhouseDbResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRDSToClickhouseDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRDSToClickhouseDbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRDSToClickhouseDbResponse setBody(ModifyRDSToClickhouseDbResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRDSToClickhouseDbResponseBody getBody() {
        return this.body;
    }

}
