// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatasetsStatisticsResponseBody body;

    public static GetDatasetsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetsStatisticsResponse self = new GetDatasetsStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasetsStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasetsStatisticsResponse setBody(GetDatasetsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasetsStatisticsResponseBody getBody() {
        return this.body;
    }

}
