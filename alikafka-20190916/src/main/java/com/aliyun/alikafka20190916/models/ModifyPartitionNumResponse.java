// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyPartitionNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPartitionNumResponseBody body;

    public static ModifyPartitionNumResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPartitionNumResponse self = new ModifyPartitionNumResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPartitionNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPartitionNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPartitionNumResponse setBody(ModifyPartitionNumResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPartitionNumResponseBody getBody() {
        return this.body;
    }

}
