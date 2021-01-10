// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStatisticsResponseBody body;

    public static GetStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStatisticsResponse self = new GetStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStatisticsResponse setBody(GetStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStatisticsResponseBody getBody() {
        return this.body;
    }

}
