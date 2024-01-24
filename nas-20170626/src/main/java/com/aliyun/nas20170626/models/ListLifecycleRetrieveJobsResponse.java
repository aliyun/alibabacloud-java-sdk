// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListLifecycleRetrieveJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLifecycleRetrieveJobsResponseBody body;

    public static ListLifecycleRetrieveJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLifecycleRetrieveJobsResponse self = new ListLifecycleRetrieveJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListLifecycleRetrieveJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLifecycleRetrieveJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLifecycleRetrieveJobsResponse setBody(ListLifecycleRetrieveJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLifecycleRetrieveJobsResponseBody getBody() {
        return this.body;
    }

}
