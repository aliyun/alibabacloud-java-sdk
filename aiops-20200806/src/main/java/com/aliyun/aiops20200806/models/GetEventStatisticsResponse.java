// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEventStatisticsResponseBody body;

    public static GetEventStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventStatisticsResponse self = new GetEventStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetEventStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventStatisticsResponse setBody(GetEventStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventStatisticsResponseBody getBody() {
        return this.body;
    }

}
