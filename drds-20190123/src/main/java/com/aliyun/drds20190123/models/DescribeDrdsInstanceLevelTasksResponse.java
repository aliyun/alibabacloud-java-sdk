// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceLevelTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDrdsInstanceLevelTasksResponseBody body;

    public static DescribeDrdsInstanceLevelTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceLevelTasksResponse self = new DescribeDrdsInstanceLevelTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceLevelTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsInstanceLevelTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsInstanceLevelTasksResponse setBody(DescribeDrdsInstanceLevelTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsInstanceLevelTasksResponseBody getBody() {
        return this.body;
    }

}
