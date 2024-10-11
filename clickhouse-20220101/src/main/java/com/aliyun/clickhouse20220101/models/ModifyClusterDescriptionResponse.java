// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyClusterDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterDescriptionResponseBody body;

    public static ModifyClusterDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDescriptionResponse self = new ModifyClusterDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterDescriptionResponse setBody(ModifyClusterDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterDescriptionResponseBody getBody() {
        return this.body;
    }

}
