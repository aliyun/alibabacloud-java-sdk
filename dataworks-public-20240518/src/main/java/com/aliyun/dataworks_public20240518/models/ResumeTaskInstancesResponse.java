// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ResumeTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeTaskInstancesResponseBody body;

    public static ResumeTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeTaskInstancesResponse self = new ResumeTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ResumeTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeTaskInstancesResponse setBody(ResumeTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
