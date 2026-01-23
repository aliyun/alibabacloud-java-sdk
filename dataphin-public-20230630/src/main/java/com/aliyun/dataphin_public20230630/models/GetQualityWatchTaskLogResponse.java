// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityWatchTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityWatchTaskLogResponseBody body;

    public static GetQualityWatchTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityWatchTaskLogResponse self = new GetQualityWatchTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityWatchTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityWatchTaskLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityWatchTaskLogResponse setBody(GetQualityWatchTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityWatchTaskLogResponseBody getBody() {
        return this.body;
    }

}
