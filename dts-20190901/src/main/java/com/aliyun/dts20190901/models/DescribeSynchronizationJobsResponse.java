// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSynchronizationJobsResponseBody body;

    public static DescribeSynchronizationJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobsResponse self = new DescribeSynchronizationJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynchronizationJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSynchronizationJobsResponse setBody(DescribeSynchronizationJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynchronizationJobsResponseBody getBody() {
        return this.body;
    }

}
