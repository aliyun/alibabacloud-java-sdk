// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableProducingTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaTableProducingTasksResponseBody body;

    public static GetMetaTableProducingTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableProducingTasksResponse self = new GetMetaTableProducingTasksResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableProducingTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableProducingTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaTableProducingTasksResponse setBody(GetMetaTableProducingTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableProducingTasksResponseBody getBody() {
        return this.body;
    }

}
