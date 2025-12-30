// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class DashscopeAsyncTaskFinishEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DashscopeAsyncTaskFinishEventResponseBody body;

    public static DashscopeAsyncTaskFinishEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DashscopeAsyncTaskFinishEventResponse self = new DashscopeAsyncTaskFinishEventResponse();
        return TeaModel.build(map, self);
    }

    public DashscopeAsyncTaskFinishEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DashscopeAsyncTaskFinishEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DashscopeAsyncTaskFinishEventResponse setBody(DashscopeAsyncTaskFinishEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DashscopeAsyncTaskFinishEventResponseBody getBody() {
        return this.body;
    }

}
