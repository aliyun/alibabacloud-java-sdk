// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListJobsWithFiltersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListJobsWithFiltersResponse setBody(ListJobsWithFiltersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobsWithFiltersResponseBody getBody() {
        return this.body;
    }

}
