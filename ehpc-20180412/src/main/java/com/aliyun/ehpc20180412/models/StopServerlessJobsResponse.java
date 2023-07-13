// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopServerlessJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopServerlessJobsResponseBody body;

    public static StopServerlessJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        StopServerlessJobsResponse self = new StopServerlessJobsResponse();
        return TeaModel.build(map, self);
    }

    public StopServerlessJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopServerlessJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopServerlessJobsResponse setBody(StopServerlessJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public StopServerlessJobsResponseBody getBody() {
        return this.body;
    }

}
