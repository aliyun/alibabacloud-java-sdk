// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyClusterNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterNameResponseBody body;

    public static ModifyClusterNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNameResponse self = new ModifyClusterNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterNameResponse setBody(ModifyClusterNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterNameResponseBody getBody() {
        return this.body;
    }

}
