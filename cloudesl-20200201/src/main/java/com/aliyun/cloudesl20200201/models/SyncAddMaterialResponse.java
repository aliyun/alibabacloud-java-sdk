// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class SyncAddMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncAddMaterialResponseBody body;

    public static SyncAddMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncAddMaterialResponse self = new SyncAddMaterialResponse();
        return TeaModel.build(map, self);
    }

    public SyncAddMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncAddMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncAddMaterialResponse setBody(SyncAddMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncAddMaterialResponseBody getBody() {
        return this.body;
    }

}
