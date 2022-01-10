// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetImagesStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetImagesStatisticsResponseBody body;

    public static GetImagesStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImagesStatisticsResponse self = new GetImagesStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetImagesStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImagesStatisticsResponse setBody(GetImagesStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImagesStatisticsResponseBody getBody() {
        return this.body;
    }

}
