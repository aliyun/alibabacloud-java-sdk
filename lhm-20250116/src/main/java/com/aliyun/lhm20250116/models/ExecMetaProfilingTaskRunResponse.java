// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecMetaProfilingTaskRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecMetaProfilingTaskRunResponseBody body;

    public static ExecMetaProfilingTaskRunResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecMetaProfilingTaskRunResponse self = new ExecMetaProfilingTaskRunResponse();
        return TeaModel.build(map, self);
    }

    public ExecMetaProfilingTaskRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecMetaProfilingTaskRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecMetaProfilingTaskRunResponse setBody(ExecMetaProfilingTaskRunResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecMetaProfilingTaskRunResponseBody getBody() {
        return this.body;
    }

}
