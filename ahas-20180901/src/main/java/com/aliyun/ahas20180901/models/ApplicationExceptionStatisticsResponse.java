// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ApplicationExceptionStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplicationExceptionStatisticsResponseBody body;

    public static ApplicationExceptionStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplicationExceptionStatisticsResponse self = new ApplicationExceptionStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ApplicationExceptionStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplicationExceptionStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplicationExceptionStatisticsResponse setBody(ApplicationExceptionStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplicationExceptionStatisticsResponseBody getBody() {
        return this.body;
    }

}
