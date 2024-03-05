// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobsWithFiltersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobsWithFiltersResponseBody body;

    public static ListJobsWithFiltersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobsWithFiltersResponse self = new ListJobsWithFiltersResponse();
        return TeaModel.build(map, self);
    }

    public ListJobsWithFiltersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobsWithFiltersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobsWithFiltersResponse setBody(ListJobsWithFiltersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobsWithFiltersResponseBody getBody() {
        return this.body;
    }

}
