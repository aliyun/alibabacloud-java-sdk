// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorSyncPayStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CooperatorSyncPayStatusResponseBody body;

    public static CooperatorSyncPayStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CooperatorSyncPayStatusResponse self = new CooperatorSyncPayStatusResponse();
        return TeaModel.build(map, self);
    }

    public CooperatorSyncPayStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CooperatorSyncPayStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CooperatorSyncPayStatusResponse setBody(CooperatorSyncPayStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CooperatorSyncPayStatusResponseBody getBody() {
        return this.body;
    }

}
