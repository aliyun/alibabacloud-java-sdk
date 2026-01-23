// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityWatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityWatchTaskResponseBody body;

    public static GetQualityWatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityWatchTaskResponse self = new GetQualityWatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityWatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityWatchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityWatchTaskResponse setBody(GetQualityWatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityWatchTaskResponseBody getBody() {
        return this.body;
    }

}
