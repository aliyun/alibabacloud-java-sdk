// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ResourceExceptionStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResourceExceptionStatisticsResponseBody body;

    public static ResourceExceptionStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ResourceExceptionStatisticsResponse self = new ResourceExceptionStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ResourceExceptionStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResourceExceptionStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResourceExceptionStatisticsResponse setBody(ResourceExceptionStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ResourceExceptionStatisticsResponseBody getBody() {
        return this.body;
    }

}
