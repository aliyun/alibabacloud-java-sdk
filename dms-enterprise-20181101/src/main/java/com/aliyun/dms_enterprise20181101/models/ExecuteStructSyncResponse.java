// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteStructSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteStructSyncResponseBody body;

    public static ExecuteStructSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStructSyncResponse self = new ExecuteStructSyncResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteStructSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteStructSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteStructSyncResponse setBody(ExecuteStructSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteStructSyncResponseBody getBody() {
        return this.body;
    }

}
