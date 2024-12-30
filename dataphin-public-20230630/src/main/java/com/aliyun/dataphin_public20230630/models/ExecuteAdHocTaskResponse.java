// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteAdHocTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAdHocTaskResponseBody body;

    public static ExecuteAdHocTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAdHocTaskResponse self = new ExecuteAdHocTaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAdHocTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAdHocTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAdHocTaskResponse setBody(ExecuteAdHocTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAdHocTaskResponseBody getBody() {
        return this.body;
    }

}
