// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetCodeSourcesStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCodeSourcesStatisticsResponseBody body;

    public static GetCodeSourcesStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCodeSourcesStatisticsResponse self = new GetCodeSourcesStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetCodeSourcesStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCodeSourcesStatisticsResponse setBody(GetCodeSourcesStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCodeSourcesStatisticsResponseBody getBody() {
        return this.body;
    }

}
