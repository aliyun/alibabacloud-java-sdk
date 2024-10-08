// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribePurgeTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePurgeTasksResponseBody body;

    public static DescribePurgeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePurgeTasksResponse self = new DescribePurgeTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribePurgeTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePurgeTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePurgeTasksResponse setBody(DescribePurgeTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurgeTasksResponseBody getBody() {
        return this.body;
    }

}
