// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ParseBatchTaskDependencyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ParseBatchTaskDependencyResponseBody body;

    public static ParseBatchTaskDependencyResponse build(java.util.Map<String, ?> map) throws Exception {
        ParseBatchTaskDependencyResponse self = new ParseBatchTaskDependencyResponse();
        return TeaModel.build(map, self);
    }

    public ParseBatchTaskDependencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ParseBatchTaskDependencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ParseBatchTaskDependencyResponse setBody(ParseBatchTaskDependencyResponseBody body) {
        this.body = body;
        return this;
    }
    public ParseBatchTaskDependencyResponseBody getBody() {
        return this.body;
    }

}
