// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFotaTasksResponseBody body;

    public static DescribeFotaTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFotaTasksResponse self = new DescribeFotaTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFotaTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFotaTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFotaTasksResponse setBody(DescribeFotaTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFotaTasksResponseBody getBody() {
        return this.body;
    }

}
