// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListServerlessJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServerlessJobsResponseBody body;

    public static ListServerlessJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServerlessJobsResponse self = new ListServerlessJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListServerlessJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServerlessJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServerlessJobsResponse setBody(ListServerlessJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServerlessJobsResponseBody getBody() {
        return this.body;
    }

}
