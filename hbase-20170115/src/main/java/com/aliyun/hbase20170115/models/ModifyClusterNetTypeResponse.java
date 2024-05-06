// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyClusterNetTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterNetTypeResponseBody body;

    public static ModifyClusterNetTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNetTypeResponse self = new ModifyClusterNetTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNetTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterNetTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterNetTypeResponse setBody(ModifyClusterNetTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterNetTypeResponseBody getBody() {
        return this.body;
    }

}
