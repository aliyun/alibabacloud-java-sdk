// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class GetInvokeStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInvokeStatisticsResponseBody body;

    public static GetInvokeStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInvokeStatisticsResponse self = new GetInvokeStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetInvokeStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInvokeStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInvokeStatisticsResponse setBody(GetInvokeStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInvokeStatisticsResponseBody getBody() {
        return this.body;
    }

}
