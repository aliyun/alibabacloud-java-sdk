// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTaskInstanceLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskInstanceLogResponseBody body;

    public static GetTaskInstanceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInstanceLogResponse self = new GetTaskInstanceLogResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskInstanceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskInstanceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskInstanceLogResponse setBody(GetTaskInstanceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskInstanceLogResponseBody getBody() {
        return this.body;
    }

}
