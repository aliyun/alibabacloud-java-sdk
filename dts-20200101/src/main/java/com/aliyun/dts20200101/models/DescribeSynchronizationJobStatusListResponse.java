// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobStatusListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSynchronizationJobStatusListResponseBody body;

    public static DescribeSynchronizationJobStatusListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobStatusListResponse self = new DescribeSynchronizationJobStatusListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobStatusListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynchronizationJobStatusListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSynchronizationJobStatusListResponse setBody(DescribeSynchronizationJobStatusListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynchronizationJobStatusListResponseBody getBody() {
        return this.body;
    }

}
